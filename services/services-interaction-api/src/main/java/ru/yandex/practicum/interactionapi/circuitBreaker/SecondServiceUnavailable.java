package ru.yandex.practicum.interactionapi.circuitBreaker;

public class SecondServiceUnavailable extends RuntimeException {
    public SecondServiceUnavailable(String message) {
        super(message);
    }
}
