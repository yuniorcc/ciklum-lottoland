package com.ciklum.lottoland.dtos;

import com.ciklum.lottoland.business.enums.Outcome;
import com.ciklum.lottoland.business.enums.Play;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameResult {

    private Play playerOne;
    private Play playerTwo;
    private Outcome outcome;
}
