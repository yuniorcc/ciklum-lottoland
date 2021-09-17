package business.game;

import business.enums.Outcome;
import business.enums.Play;

public interface Game {

    Outcome playGame(Play playOne, Play playTwo);
}
