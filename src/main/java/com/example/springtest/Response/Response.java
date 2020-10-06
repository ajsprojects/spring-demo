package com.example.springtest.Response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class Response {
    public String body;
    public HttpStatus status;
}
