package com.ciklum.lottoland.services.impl;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.business.game.Game;
import com.ciklum.lottoland.business.player.Player;
import com.ciklum.lottoland.dtos.GameResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GameServiceImplTests {

    private Game game;
    private Player playerOne;
    private Player playerTwo;
    private GameServiceImpl gameService;

    @BeforeEach
    public void setup() {

        game = mock(Game.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        gameService = new GameServiceImpl(game, playerOne, playerTwo);
    }

    @Test
    public void testPlayGameService() {

        doReturn(Play.PAPER).when(playerOne).play();
        doReturn(Play.ROCK).when(playerTwo).play();
        doReturn(Outcome.WINNER_ONE).when(game).playGame(Play.PAPER, Play.ROCK);

        GameResult gameResult = gameService.playGame();

        verify(playerOne, times(1)).play();
        verify(playerTwo, times(1)).play();
        verify(game, times(1)).playGame(Play.PAPER, Play.ROCK);

        assertEquals(Play.PAPER, gameResult.getPlayerOne());
        assertEquals(Play.ROCK, gameResult.getPlayerTwo());
        assertEquals(Outcome.WINNER_ONE, gameResult.getOutcome());
    }
}
