package business.player.random;

import business.enums.Play;
import business.player.Player;

import java.util.Random;

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
