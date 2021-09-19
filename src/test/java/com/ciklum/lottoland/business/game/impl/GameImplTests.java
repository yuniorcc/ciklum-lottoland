package com.ciklum.lottoland.business.game.impl;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameImplTests {

    private GameImpl game = new GameImpl();

    @Test
    public void shouldReturnDrawForTheSamePlay() {

        Outcome outcome = game.playGame(Play.ROCK, Play.ROCK);
        assertEquals(Outcome.DRAW, outcome);
        outcome = game.playGame(Play.PAPER, Play.PAPER);
        assertEquals(Outcome.DRAW, outcome);
        outcome = game.playGame(Play.SCISSORS, Play.SCISSORS);
        assertEquals(Outcome.DRAW, outcome);
    }

    @Test
    public void paperShouldWinOverRock() {

        playOneShouldWinOverPlayTwo(Play.PAPER, Play.ROCK);
    }

    @Test
    public void scissorsShouldWinOverPaper() {

        playOneShouldWinOverPlayTwo(Play.SCISSORS, Play.PAPER);
    }

    @Test
    public void rockShouldWinOverScissors() {

        playOneShouldWinOverPlayTwo(Play.ROCK, Play.SCISSORS);
    }

    private void playOneShouldWinOverPlayTwo(Play playOne, Play playTwo) {

        Outcome outcome = game.playGame(playOne, playTwo);
        assertEquals(Outcome.WINNER_ONE, outcome);

        outcome = game.playGame(playTwo, playOne);
        assertEquals(Outcome.WINNER_TWO, outcome);
    }
}
