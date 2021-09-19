package com.ciklum.lottoland.dtos;

import lombok.Data;

@Data
public class Stats {

    private long rounds;
    private long playerOneWins;
    private long playerTwoWins;
    private long draws;
}
