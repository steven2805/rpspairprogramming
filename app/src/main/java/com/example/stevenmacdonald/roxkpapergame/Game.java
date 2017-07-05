package com.example.stevenmacdonald.roxkpapergame;


import java.util.ArrayList;
import java.util.Random;

public class Game {
    private String player;
//    private String[] choices;


    public Game(String player) {
        this.player = player;
        String[] choices = {"rock","paper","scissors"};

    }

    public String getPlayerChoice() {
        return player;
    }

    public void setPlayerChoice(String player) {
        this.player = player;
    }

    public String getRandCompChoice() {
        String[] choices = {"rock","paper","scissors"};
        int rnd = new Random().nextInt(choices.length);
        return choices[rnd];
    }

}