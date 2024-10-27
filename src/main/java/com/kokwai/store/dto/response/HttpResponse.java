package com.kokwai.store.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HttpResponse {
    private int code;
    private boolean error;
    private String message;
    private Object data;
    private Map<?, ?> audit;
    private LocalDateTime timestamp = LocalDateTime.now();
}