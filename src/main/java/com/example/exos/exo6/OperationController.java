package com.example.exos.exo6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class OperationController {
    private OperationController() {
    }

    @GetMapping("/api/processed-numbers")
    Flux<String> processedNumbers() {
        return Flux.range(1, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 10)
                .map(String::valueOf);
    }
}
