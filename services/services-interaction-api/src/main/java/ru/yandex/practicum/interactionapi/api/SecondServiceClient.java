package ru.yandex.practicum.interactionapi.api;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.interactionapi.circuitBreaker.SecondServiceClientFallback;
import ru.yandex.practicum.interactionapi.dto.ResponceDto;

@FeignClient(name = "second-service",
        fallback = SecondServiceClientFallback.class)
public interface SecondServiceClient {

    @CircuitBreaker(name = "default")
    @GetMapping("/api/v1/hello")
    ResponceDto getHello();
}
