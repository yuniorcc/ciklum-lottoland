package com.ciklum.lottoland.controllers.stats.impl;

import com.ciklum.lottoland.controllers.stats.StatsController;
import com.ciklum.lottoland.dtos.Stats;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StatsControllerImpl implements StatsController {

    private Stats gameStats;

    @Override
    public ResponseEntity<Stats> getStats() {

        return ResponseEntity.ok(gameStats);
    }
}
