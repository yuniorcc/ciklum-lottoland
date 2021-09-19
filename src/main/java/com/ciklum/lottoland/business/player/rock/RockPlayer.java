package com.ciklum.lottoland.business.player.rock;

import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.business.player.Player;

public class RockPlayer implements Player {

    @Override
    public Play play() {

        return Play.ROCK;
    }
}
