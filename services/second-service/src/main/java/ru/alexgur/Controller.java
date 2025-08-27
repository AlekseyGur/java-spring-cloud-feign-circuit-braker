package ru.alexgur;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.interactionapi.api.SecondServiceClient;
import ru.yandex.practicum.interactionapi.dto.ResponceDto;

@RestController
@RequiredArgsConstructor
public class Controller implements SecondServiceClient {

    public ResponceDto getHello() {
        String res = "Hello from second server! PID: " + ProcessHandle.current().pid();
        return new ResponceDto("second-server", res);
    }

    public ResponceDto checkDelay()  {
        try {
            Thread.sleep(60 * 1000); // Задержка в 60 секунд
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new ResponceDto("second-server", "Hello");
    }

}