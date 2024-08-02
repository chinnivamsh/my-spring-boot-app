package com.example.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Request {

    @JsonProperty("data")
    private List<String> data;

}
