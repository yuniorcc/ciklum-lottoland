package business.player.rock;

import business.enums.Play;
import business.player.Player;

public class RockPlayer implements Player {

    @Override
    public Play play() {

        return Play.ROCK;
    }
}
