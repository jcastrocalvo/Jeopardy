package com.jcastrocalvo.jeopardy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MenuActivity extends AppCompatActivity {

    String ipAddress = "192.168.4.1";
    String portNumber = "333";
    Player playerOne;
    Player playerTwo;

    //just creates te activity and sets the players info
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        playerOne = new Player(1, ipAddress, portNumber);
        playerTwo = new Player(2, ipAddress, portNumber);
    }

    //serializes the player info so we can send it accross activities
    public void sendMessage(View view) {
        Intent intent = new Intent(this, BoardActivity.class);
        //set the keys so we can deserialize them on the other end
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        startActivity(intent);
    }
}
