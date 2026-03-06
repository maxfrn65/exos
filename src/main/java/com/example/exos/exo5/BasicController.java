package com.example.exos.exo5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BasicController {
    private BasicController() {
    }

    @GetMapping("/api/welcome")
    Mono<String> welcome() {
        return Mono.just("Welcome to Project Reactor!");
    }

    @GetMapping("/api/numbers")
    Flux<Integer> numbers() {
        return Flux.range(1, 5);
    }
}
