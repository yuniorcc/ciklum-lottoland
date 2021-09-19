package com.ciklum.lottoland.controllers.stats.impl;

import com.ciklum.lottoland.controllers.stats.StatsController;
import com.ciklum.lottoland.dtos.Stats;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class StatsControllerImplTests {

    private static final String URL = "/stats";

    private MockMvc mockMvc;
    private Stats gameStats;
    private StatsController statsController;

    @BeforeEach
    public void setup() {

        gameStats = new Stats();
        statsController = new StatsControllerImpl(gameStats);
        mockMvc = MockMvcBuilders.standaloneSetup(statsController).build();
    }

    @Test
    public void shouldReturnOk() throws Exception {

        mockMvc.perform(get(URL))
                .andExpect(status().isOk())
                .andExpect(content().string((new ObjectMapper()).writeValueAsString(gameStats)));
    }
}
