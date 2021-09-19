package com.ciklum.lottoland.business.game;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;

public interface Game {

    Outcome playGame(Play playOne, Play playTwo);
}
