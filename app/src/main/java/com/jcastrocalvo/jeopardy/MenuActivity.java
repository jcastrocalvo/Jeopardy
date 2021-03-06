package com.jcastrocalvo.jeopardy;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import java.util.Objects;
import java.util.Set;

import static com.jcastrocalvo.jeopardy.Constants.REQUEST_ENABLE_BT;

public class MenuActivity extends AppCompatActivity {

    String ipAddress = "192.168.4.1";
    String portNumber = "80";
    Player playerOne;
    Player playerTwo;
    BluetoothDevice deviceToPass;
    BluetoothService bluetoothService;
    BluetoothDevice Device;


    //just creates te activity and sets the players info
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        playerOne = new Player(1, ipAddress, portNumber);
        playerTwo = new Player(2, ipAddress, portNumber);

        bluetoothService = BluetoothService.getInstance();
    }

    @Override
    public void onPause() {
        super.onPause();
    }


    //serializes the player info so we can send it accross activities
    public void sendMessage(View view) {
        Intent intent = new Intent(this, BoardActivity.class);
        //set the keys so we can deserialize them on the other end
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("Device", deviceToPass);
        startActivity(intent);
    }

    public void resetScores(View view){
        new Request(
                MenuActivity.this, Integer.toString(0), playerOne.getIP(), playerTwo.getPort(), "score"
        ).execute();
        if (bluetoothService.getState() != Constants.STATE_CONNECTED)
            System.out.println("There was a problem with the connection");
        byte[] message =  Integer.toString(0).getBytes();
        bluetoothService.write(message);
    }
}
