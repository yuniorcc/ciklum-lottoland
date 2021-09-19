package com.ciklum.lottoland.controllers.stats;

import com.ciklum.lottoland.dtos.Stats;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/stats")
public interface StatsController {

    @GetMapping
    ResponseEntity<Stats> getStats();
}
