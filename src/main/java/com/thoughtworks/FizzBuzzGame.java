package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result = null;
            if(i % 3 == 0){
                result = "Fizz";
            }
            results.add(Optional.ofNullable(result).orElse(String.valueOf(i)));
        }
    }

    public List<String> getResults() {
        return results;
    }
}


