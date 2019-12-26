package com.diandi.exception;

/**
 * @program: EatJoke
 * @description:
 * @author: You毒
 * @create: 2019-12-25 19:31
 **/
public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String msg) {
        super(msg);
    }
}
