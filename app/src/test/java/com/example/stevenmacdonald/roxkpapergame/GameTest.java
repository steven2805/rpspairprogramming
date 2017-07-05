package com.example.stevenmacdonald.roxkpapergame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by stevenmacdonald on 05/07/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game("rock");
    }

    @Test
    public void canGetPlayerChoice(){
        assertEquals("rock",game.getPlayerChoice());
    }

    @Test
    public void canSetPlayerChoice(){
        game.setPlayerChoice("paper");
        assertEquals("paper", game.getPlayerChoice());
    }

    @Test
    public void checkPlayerCanWin() {
        assertEquals("computer chose scissors you win !!",game.getWinner("scissors"));
    }

    @Test
    public void checkComputerCanWin() {
        game = new Game("scissors");
        assertEquals("computer chose paper you win !!!",game.getWinner("paper"));
    }

    @Test
    public void checkCanDraw() {
        assertEquals("draw you and computer chose rock", game.getWinner("rock"));
    }

    @Test
    public void checkInvalidChoice() {
        game = new Game("gun");
        assertEquals("that is not a valid choice - try again!", game.getWinner("rock"));
    }

}
