package com.example.stevenmacdonald.roxkpapergame;
import java.util.Random;

public class Game {
    private String player;

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

    public String getWinner(String computer){
        if(player == computer) {
            return "draw";
        } else if (player == "rock" && computer == "scissors") {
            return "you win!!!!!";
        } else if (player == "paper" && computer == "rock") {
            return "you win!!!!!";
        } else if (player == "scissors" && computer == "paper") {
        return "you win!!!!!";
        } else
            return "computer wins!!!!";

    }

//    Activity file?
// Game game = new Game("Paper");
//    String computer = game.getRandCompChoice();
//    String result = game.getWinner(computer);


}