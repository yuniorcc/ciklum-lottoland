package com.ciklum.lottoland.aspect;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.dtos.Stats;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStatsAspectTests {

    private Stats gameStats;
    private GameStatsAspect gameStatsAspect;

    @BeforeEach
    public void setup() {

        gameStats = new Stats();
        gameStatsAspect = new GameStatsAspect(gameStats);
    }

    @Test
    public void testGameStatsAspect() {

        gameStatsAspect.gameStatsAspect(Outcome.WINNER_ONE);
        gameStatsAspect.gameStatsAspect(Outcome.WINNER_ONE);

        gameStatsAspect.gameStatsAspect(Outcome.WINNER_TWO);
        gameStatsAspect.gameStatsAspect(Outcome.WINNER_TWO);
        gameStatsAspect.gameStatsAspect(Outcome.WINNER_TWO);

        gameStatsAspect.gameStatsAspect(Outcome.DRAW);
        gameStatsAspect.gameStatsAspect(Outcome.DRAW);
        gameStatsAspect.gameStatsAspect(Outcome.DRAW);
        gameStatsAspect.gameStatsAspect(Outcome.DRAW);

        assertEquals(9, gameStats.getRounds());
        assertEquals(2, gameStats.getPlayerOneWins());
        assertEquals(3, gameStats.getPlayerTwoWins());
        assertEquals(4, gameStats.getDraws());
    }
}
