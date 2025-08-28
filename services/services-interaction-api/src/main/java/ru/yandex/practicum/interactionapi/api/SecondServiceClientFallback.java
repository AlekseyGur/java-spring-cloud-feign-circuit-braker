package ru.yandex.practicum.interactionapi.api;

import org.springframework.stereotype.Component;
import ru.yandex.practicum.interactionapi.dto.ResponceDto;

@Component
public class SecondServiceClientFallback implements SecondServiceClient {

    @Override
    public ResponceDto getHello() {
        return new ResponceDto("second-service",
                "Второй сервис недоступен!");
    }

    @Override
    public ResponceDto checkDelay(float delaySeconds) {
        return new ResponceDto("second-service",
                "Второй сервис недоступен по таймауту в " +
                        delaySeconds + " сек!");
    }
}
