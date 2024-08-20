package com.frank.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersuibYUD = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

}
