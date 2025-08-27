package ru.yandex.practicum.interactionapi.circuitBreaker;

import org.springframework.stereotype.Component;
import ru.yandex.practicum.interactionapi.api.SecondServiceClient;
import ru.yandex.practicum.interactionapi.dto.ResponceDto;

@Component
public class SecondServiceClientFallback implements SecondServiceClient {

    @Override
    public ResponceDto getHello() {
        return new ResponceDto("fallback", "Второй сервис недоступен!");
    }
}
