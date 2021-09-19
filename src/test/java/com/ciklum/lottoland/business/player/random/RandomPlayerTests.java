package com.ciklum.lottoland.business.player.random;

import com.ciklum.lottoland.business.enums.Play;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomPlayerTests {

    private static final int ATTEMPTS = 1000000;
    private static final double ERROR_RATIO = 0.03;
    private static final double RANGE_FROM = (1d / 3) - ERROR_RATIO;
    private static final double RANGE_TO = (1d / 3) + ERROR_RATIO;

    private RandomPlayer player = new RandomPlayer();

    @Test
    public void shouldReturnEveryPlayWithTheSameProbability() {

        Play play;

        int rockCounter = 0;
        int paperCounter = 0;
        int scissorsCounter = 0;

        for (int i = 0; i < ATTEMPTS; i++) {

            play = player.play();
            if (play == Play.ROCK) {
                rockCounter++;
            }
            if (play == Play.PAPER) {
                paperCounter++;
            }
            if (play == Play.SCISSORS) {
                scissorsCounter++;
            }
        }

        assertTrue(isInsideRange(rockCounter));
        assertTrue(isInsideRange(paperCounter));
        assertTrue(isInsideRange(scissorsCounter));
    }

    private boolean isInsideRange(int counter) {

        double ratio = (double) counter / ATTEMPTS;
        return ratio > RANGE_FROM && ratio < RANGE_TO;
    }
}
