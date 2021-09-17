package com.ciklum.lottoland.business.player.rock;

import business.enums.Play;
import business.player.rock.RockPlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPlayerTests {

    private static final int ATTEMPTS = 1000000;

    private RockPlayer player = new RockPlayer();

    @Test
    public void shouldReturnRockEveryTime() {

        Play play;
        for (int i = 0; i < ATTEMPTS; i++) {
            play = player.play();
            assertEquals(Play.ROCK, play);
        }
    }
}
