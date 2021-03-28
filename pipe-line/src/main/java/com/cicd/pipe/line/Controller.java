package com.cicd.pipe.line;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/student")
    public ResponseEntity<String> getStudentDetails(){
        String student = "Hello Student";
        return new ResponseEntity<String>(student, HttpStatus.OK);
    }
}
