package ru.skypro.homework__2__testing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideException extends IllegalArgumentException{

    public DivideException() {
        super("на ноль делить нельзя! ");
    }
}
