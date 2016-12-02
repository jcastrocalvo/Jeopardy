package com.jcastrocalvo.jeopardy;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by joaquinc on 11/16/16.
 * Created for Jeopardy
 * Included in Package ${PACKAGE_NAME}
 */

//Player class that holds references to the whole player, including score, number, ip and port
//implements Parcelable due to the fact that we need to make it serializeable so we can pass it around activities
public class Player implements Parcelable{
    private int number;
    private int score;
    private String ip;
    private String port;

    //getters and setters
    public void setIp(String Ip) { ip = Ip;}

    public String getIP(){
        return ip;
    }

    //getters and setters
    public void setPort(String Port) { port = Port;}

    public String getPort(){ return port; }


    //getters and setters
    public void setNumber(int Number){ number = Number; }

    public int getNumber(){ return number; }


    //getters and setters
    public void setScore(int Score){ score = Score; }

    public int getScorer(){ return score; }

    //consturctors for the serialized and deserialized objects
    public Player(int PlayerNumber, String Ip, String Port){
        number = PlayerNumber;
        score = 0;
        ip = Ip;
        port = Port;
    }

    private Player(Parcel in) {
        number = in.readInt();
        score = in.readInt();
        ip = in.readString();
        port = in.readString();
    }


    //need to override these for serializing the objects
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(number);
        parcel.writeInt(score);
        parcel.writeString(ip);
        parcel.writeString(port);
    }

    //this is to create the serialize-able object so that we can read it
    public static final Parcelable.Creator<Player> CREATOR = new Parcelable.Creator<Player>() {
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
