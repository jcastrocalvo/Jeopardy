package com.jcastrocalvo.jeopardy;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Joaquin Castro on 11/16/16.
 * Created for Jeopardy
 * Included in Package com.jcastrocalvo.jeopardy
 */

//this is the question activity that handles all of the actual sending to update score
public class QuestionActivity extends AppCompatActivity {
    int time = 5;
    TextView timerTextView;
    TextView question;
	TextView answer;
    Player playerOne;
    Player playerTwo;
    int scoreToAdd;
    BluetoothService bluetoothService;
    BluetoothDevice Device;

    //we need to handle the threading issues of running a timer on a different thread
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionscreen);
        timerTextView  = (TextView)findViewById(R.id.Timer);
        question = (TextView)findViewById(R.id.questionName);
	    answer = (TextView)findViewById(R.id.Answer);
        //lets get ready to de-serialize these players
        Intent i = getIntent();
        //deserialize the players so we can access their information
        playerOne = i.getParcelableExtra("Player1");
        playerTwo = i.getParcelableExtra("Player2");
        scoreToAdd = i.getIntExtra("QuestionScore", 0);
        Device = i.getParcelableExtra("Device");
	    question.setText(i.getStringExtra("Question"));
	    answer.setText(i.getStringExtra("Answer"));


        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            // Loop through paired devices
            for (BluetoothDevice device : pairedDevices) {
                // Add the name and address to an array adapter to show in a ListView
                if(Objects.equals(device.getAddress(), "20:16:03:25:62:42"))
                    Device = device;
                System.out.println(device.getName() + "\n" + device.getAddress());
            }
        }
        android.os.Handler handler = new android.os.Handler();
        bluetoothService = new BluetoothService(handler, Device);
        bluetoothService.connect();

        //now we do the threading magic so we run on the main thread
        final Timer timer = new Timer();
        //schedule the timer
        timer.scheduleAtFixedRate( new TimerTask() {
            @Override
            public void run() {
                //run on the same thread as the UI so we can update the textbox
                runOnUiThread(new Runnable() //run on ui thread
                {
                    public void run()
                    {
                        time--;
                        timerTextView.setText(Integer.toString(time));
                    }
                });
                if(time == 1)
                {
                    //we also need to open the dialog to give points so we also need to invoke this on the main thread
                    new Thread() {
                        public void run() {
                            QuestionActivity.this.runOnUiThread(new Runnable(){

                                @Override
                                public void run(){
                                    displayDialog();
                                }
                            });
                        }
                    }.start();
                    timer.cancel();
                }
            }
        }, 1000, 1000 );

    }


    //display the dialog with options for each player and no answer possibility
    public void displayDialog(){
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        //set the title
        alertDialog.setTitle("Answered?");

        //set the question
        alertDialog.setMessage("Who answered the question?");

        //first button to give points to the first player
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Player 1", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //executes the request to give points
                new Request(
                        alertDialog.getContext(), Integer.toString(scoreToAdd), playerOne.getIP(), playerTwo.getPort(), "score"
                ).execute();
                dialog.dismiss();
                QuestionActivity.this.finish();
            } });

        //second button to give points to the second player
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Player 2", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //executes the request to give points
                if (bluetoothService.getState() != Constants.STATE_CONNECTED)
                    System.out.println("There was a problem with the connection");
                byte[] message =  Integer.toString(scoreToAdd).getBytes();
                bluetoothService.write(message);
                dialog.dismiss();
                QuestionActivity.this.finish();
            }});

        //third button for no answer
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "No Answer", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                QuestionActivity.this.finish();
            }});
        alertDialog.show();
    }
}
