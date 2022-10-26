package ru.kata.spring.rest.JS.Exception;

import org.springframework.dao.DataIntegrityViolationException;

public class UserUsernameExistException extends DataIntegrityViolationException {
    public UserUsernameExistException(String msg) {
        super(msg);
    }
}
