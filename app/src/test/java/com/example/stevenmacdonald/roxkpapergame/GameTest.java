package com.example.stevenmacdonald.roxkpapergame;

import org.junit.Before;
import org.junit.Test;

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


}
