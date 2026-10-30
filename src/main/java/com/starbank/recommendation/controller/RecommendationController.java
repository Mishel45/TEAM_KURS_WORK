package com.starbank.recommendation.controller;

import com.starbank.recommendation.dto.RecommendationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.UUID;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    // Пока твоего нет — возвращаем пустой список
    @GetMapping("/{userId}")
    public RecommendationResponse getRecommendations(@PathVariable UUID userId) {
        return new RecommendationResponse(userId, Collections.emptyList());
    }
}