package ru.yandex.practicum.interactionapi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponceDto {
    String serverName;
    String text;
    int statusCode;
}
