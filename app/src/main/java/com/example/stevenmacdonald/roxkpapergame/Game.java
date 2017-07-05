package com.example.stevenmacdonald.roxkpapergame;
import java.util.Arrays;
import java.util.Random;

public class Game {
    private String player;
    private String[] choices;

    public Game(String player) {
        this.player = player;
        this.choices = new String[]{"rock", "paper", "scissors"};

    }

    public String getPlayerChoice() {
        return player;
    }

    public void setPlayerChoice(String player) {
        this.player = player;
    }

    public String getRandCompChoice() {
        //String[] choices = {"rock","paper","scissors"};
        int rnd = new Random().nextInt(choices.length);
        return choices[rnd];
    }

    public String getWinner(String computer){
        if(!Arrays.asList(choices).contains(player)) {
            return "that is not a valid choice - try again!";
        } else if(player == computer) {
            return "draw you and computer chose " + computer;
        } else if (player == "rock" && computer == "scissors") {
            return "Computer chose scissors you win !!";
        } else if (player == "paper" && computer == "rock") {
            return "computer chose rock you win !!!";
        } else if (player == "scissors" && computer == "paper") {
        return "computer chose paper you win !!!";
        } else
            return "computer chose " + computer + " you lose";

    }

//    Activity file?
// Game game = new Game("Paper");
//    String computer = game.getRandCompChoice();
//    String result = game.getWinner(computer);


}