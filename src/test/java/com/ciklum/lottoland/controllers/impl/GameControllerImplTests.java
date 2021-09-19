package com.ciklum.lottoland.controllers.impl;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import com.ciklum.lottoland.controllers.GameController;
import com.ciklum.lottoland.dtos.GameResult;
import com.ciklum.lottoland.services.GameService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GameControllerImplTests {

    private static final String URL = "/game/play-game";

    private MockMvc mockMvc;
    private GameService gameService;
    private GameController gameController;

    @BeforeEach
    public void setup() {

        gameService = mock(GameService.class);
        gameController = new GameControllerImpl(gameService);
        mockMvc = MockMvcBuilders.standaloneSetup(gameController).build();
    }

    @Test
    public void shouldReturnOk() throws Exception {

        GameResult gameResult = getGameResult();
        doReturn(gameResult).when(gameService).playGame();
        mockMvc.perform(post(URL))
                .andExpect(status().isOk())
                .andExpect(content().string((new ObjectMapper()).writeValueAsString(gameResult)));
    }

    private GameResult getGameResult() {

        return new GameResult(Play.SCISSORS, Play.PAPER, Outcome.WINNER_ONE);
    }
}
