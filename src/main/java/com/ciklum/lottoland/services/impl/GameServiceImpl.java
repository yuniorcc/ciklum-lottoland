package com.ciklum.lottoland.services.impl;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.business.game.Game;
import com.ciklum.lottoland.business.player.Player;
import com.ciklum.lottoland.dtos.GameResult;
import com.ciklum.lottoland.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameServiceImpl implements GameService {

    private Game game;
    private Player randomPlayer;
    private Player rockPlayer;

    @Override
    public GameResult playGame() {

        Play playOne = randomPlayer.play();
        Play playTwo = rockPlayer.play();
        Outcome outcome = game.playGame(playOne, playTwo);
        return new GameResult(playOne, playTwo, outcome);
    }
}
