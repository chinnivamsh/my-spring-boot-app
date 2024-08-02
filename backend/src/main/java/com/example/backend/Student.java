package com.example.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {

    @JsonProperty("status")
    private boolean status;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("roll_number")
    private String rollNumber;


    private List<String>numbers;

    private List<String>alphabets;

    @JsonProperty("highest_alphabet")
    private List<String>highestAlphabet;
}
