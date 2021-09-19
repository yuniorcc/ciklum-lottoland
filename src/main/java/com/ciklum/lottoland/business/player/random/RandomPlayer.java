package com.ciklum.lottoland.business.player.random;

import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.business.player.Player;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomPlayer implements Player {

    @Override
    public Play play() {

        Play play;
        int randomInteger = getRandomInteger();
        if (randomInteger == 0) {
            play = Play.ROCK;
        } else if (randomInteger == 1) {
            play = Play.PAPER;
        } else {
            play = Play.SCISSORS;
        }
        return play;
    }

    private int getRandomInteger() {

        Random random = new Random();
        return random.nextInt(3);
    }
}
