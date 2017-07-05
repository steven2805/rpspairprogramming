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

    public String getWinner(){
        String player = this.player.toLowerCase();
        String computer = getRandCompChoice();

        if(player == computer) {
            return "draw";
        } else if (player == "rock" && computer == "scissors") {
            return "you win!!!!!";
        } else if (player == "paper" && computer == "rock") {
            return "you win!!!!!";
        } else if (player == "scissors" && computer == "paper") {
        return "you win!!!!!";
        } else
            return "computer wins  !!!!";

    }



}

    def check
    if @player1 == @player2
     "draw"
             elsif (@player1 == "rock") && (@player2 == "scissors")
        "player1 win"
        elsif (@player1 == 'paper') && (@player2 == "rock")
        "player1 win"
        elsif (@player1 == "scissors") && (@player2 == "paper")
        "player1 win"
        else
        "player2 win"
        end