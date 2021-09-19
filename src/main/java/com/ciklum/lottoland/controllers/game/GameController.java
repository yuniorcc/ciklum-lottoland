package com.ciklum.lottoland.controllers.game;

import com.ciklum.lottoland.dtos.GameResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/game")
public interface GameController {

    @PostMapping(value = "/play-game")
    ResponseEntity<GameResult> playGame();
}
