package com.ciklum.lottoland.controllers.impl;

import com.ciklum.lottoland.controllers.GameController;
import com.ciklum.lottoland.dtos.GameResult;
import com.ciklum.lottoland.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GameControllerImpl implements GameController {

    private GameService gameService;

    @Override
    public ResponseEntity<GameResult> playGame() {

        GameResult gameResult = gameService.playGame();
        return ResponseEntity.ok(gameResult);
    }
}
