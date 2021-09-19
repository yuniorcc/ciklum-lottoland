package com.ciklum.lottoland.business.game.impl;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.business.game.Game;

public class GameImpl implements Game {

    @Override
    public Outcome playGame(Play playOne, Play playTwo) {

        Outcome outcome = null;
        if (playOne == playTwo) {
            outcome = Outcome.DRAW;
        } else if (playOne == Play.ROCK) {
            outcome = playTwo == Play.SCISSORS ? Outcome.WINNER_ONE : Outcome.WINNER_TWO;
        } else if (playOne == Play.PAPER) {
            outcome = playTwo == Play.ROCK ? Outcome.WINNER_ONE : Outcome.WINNER_TWO;
        } else if (playOne == Play.SCISSORS) {
            outcome = playTwo == Play.PAPER ? Outcome.WINNER_ONE : Outcome.WINNER_TWO;
        }
        return outcome;
    }
}
