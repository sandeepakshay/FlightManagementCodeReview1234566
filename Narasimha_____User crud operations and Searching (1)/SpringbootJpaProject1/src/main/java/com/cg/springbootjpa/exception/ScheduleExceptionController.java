package com.cg.springbootjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ScheduleExceptionController {
    @ExceptionHandler(value={SearchNotFoundException.class})
    public ResponseEntity<Object> exception(SearchNotFoundException exception){
  	  
  	      return new ResponseEntity<>(exception.getMessage(),HttpStatus.OK);
    }

}
