package ru.alexgur;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.interactionapi.api.SecondServiceClient;
import ru.yandex.practicum.interactionapi.dto.RequestDto;
import ru.yandex.practicum.interactionapi.dto.ResponceDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final SecondServiceClient secondServiceClient;

    @GetMapping("/echo")
    public ResponceDto getEcho(RequestDto req) {
        return new ResponceDto("first-server", req.getText());
    }

    @GetMapping("/check")
    public ResponceDto checkSecondService() {
        ResponceDto hello = secondServiceClient.getHello();
        String res = "First server got msg from second server's instance: " +
                hello.getText();
        return new ResponceDto("first-server", res);
    }

    @GetMapping("/delay")
    public ResponceDto checkSecondServiceDelay() {
        secondServiceClient.checkDelay();
        return new ResponceDto("first-server", "Done");
    }
}