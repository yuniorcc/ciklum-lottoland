package com.ciklum.lottoland.aspect;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.dtos.Stats;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@AllArgsConstructor
public class GameStatsAspect {

    private Stats gameStats;

    @AfterReturning(pointcut = "execution(* com.ciklum.lottoland.business.game.impl.GameImpl.playGame(..))", returning = "outcome")
    public void gameStatsAspect(Outcome outcome) {

        gameStats.setRounds(gameStats.getRounds() + 1);
        if (outcome == Outcome.WINNER_ONE) {
            gameStats.setPlayerOneWins(gameStats.getPlayerOneWins() + 1);
        } else if (outcome == Outcome.WINNER_TWO) {
            gameStats.setPlayerTwoWins(gameStats.getPlayerTwoWins() + 1);
        } else {
            gameStats.setDraws(gameStats.getDraws() + 1);
        }
    }
}
