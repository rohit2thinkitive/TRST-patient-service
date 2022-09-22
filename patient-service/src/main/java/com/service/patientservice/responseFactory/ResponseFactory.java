package com.service.patientservice.responseFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactory<T> {

    @Autowired
    private  schema schema;

    // method  to  generate successful response----------------------------------------------
    public ResponseEntity<T> generateSuccess(T dto){
        schema.setStatus(true);
        schema.setData(dto);
        schema.setMessage("Successful!");
        return new ResponseEntity(schema,HttpStatus.OK);
    }


    //method to generate failure response------------------------------------------------------
    public ResponseEntity<T> generateFail(T dto,String message){
        schema.setStatus(false);
        schema.setData(dto);
        schema.setMessage(message);
        return new ResponseEntity(schema,HttpStatus.NO_CONTENT);
    }

    // method to generate response when new patient added----------------------------------------
    public ResponseEntity<T> generateAdded(T dto){
        schema.setStatus(true);
        schema.setData(dto);
        schema.setMessage("Success!");
        return new ResponseEntity(schema, HttpStatus.CREATED);
    }


    public ResponseEntity<T> generateFound(T dto){
        schema.setStatus(true);
        schema.setData(dto);
        schema.setMessage("Success!");
        return new ResponseEntity(schema, HttpStatus.FOUND);
    }

    //method to generate response when user is updated-----------------------------------------
    public ResponseEntity<T> generateUpdated(T dto){
        schema.setStatus(true);
        schema.setData(dto);
        schema.setMessage("Success!");
        return new ResponseEntity(schema,HttpStatus.NO_CONTENT);
    }

}
