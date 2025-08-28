package ru.yandex.practicum.interactionapi.api;

public class SecondServiceUnavailable extends RuntimeException {
    public SecondServiceUnavailable(String message) {
        super(message);
    }
}
