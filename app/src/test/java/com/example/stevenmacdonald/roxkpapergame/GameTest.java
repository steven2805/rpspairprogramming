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


}
