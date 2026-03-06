package com.example.exos.exo7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ErrorHandlingController {
    private ErrorHandlingController() {
    }

    @GetMapping("/api/error-resume")
    Flux<String> errorResume() {
        return Flux.just("A", "B", "C", "D", "E")
                .map(value -> {
                    if (value.equals("C")) {
                        throw new RuntimeException("Error occurred!");
                    }
                    return value;
                })
                .onErrorResume(e -> Flux.just("Fallback1", "Fallback2"));
    }
}
