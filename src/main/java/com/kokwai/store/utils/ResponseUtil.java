package com.kokwai.store.utils;


import com.kokwai.store.dto.response.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public static <T> ResponseEntity<T> generateSuccessResponse(T dataObject, HttpStatus httpStatus, String message) {
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setData(dataObject);
        httpResponse.setCode(httpStatus.value());
        httpResponse.setError(false);
        httpResponse.setMessage(message);
        return new ResponseEntity<>(dataObject, httpStatus);
    }

    public static <T> ResponseEntity<T> generateErrorResponse(HttpStatus httpStatus, String message) {
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setCode(httpStatus.value());
        httpResponse.setError(true);
        httpResponse.setMessage(message);
        return new ResponseEntity<>(null, httpStatus);
    }
}
