package com.example.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    @GetMapping(value = "bfhl")
    public ResponseEntity<?>postMethod(){
        Map<String,Integer> response = new HashMap<>();
        response.put("operation_id",1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "bfhl")
    public ResponseEntity<?>postMethod(@RequestBody Request request){
        Student student = new Student();
        student.setStatus(true);
        student.setUserId("chinni_vamshi_padma_naga_sai_21082003");
        student.setEmailId("cc6283@srmist.edu.in");
        student.setRollNumber("RA2111028020022");
        List<String >numbers = new ArrayList<>();
        List<String>alphabets = new ArrayList<>();

        List<String>data = request.getData();

        for(String s : data){
            if(isNumeric(s)){
                numbers.add(s);
            } else{
                alphabets.add(s);
            }
        }
        student.setNumbers(numbers);
        student.setAlphabets(alphabets);
        List<String>highest = new ArrayList<>();
        String high = findHighestString(alphabets);
        highest.add(high);
        student.setHighestAlphabet(highest);
        return new ResponseEntity<>(student,HttpStatus.OK);

    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private  String findHighestString(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return null;
        }

        String highest = strings.get(0);
        for (String str : strings) {
            if (str.compareTo(highest) > 0) {
                highest = str;
            }
        }
        return highest;
    }
}
