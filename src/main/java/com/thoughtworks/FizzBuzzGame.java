package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result = "";
            if(i % 3 == 0){
                result = "Fizz";
            }
            if(i % 5 == 0){
                result += "Buzz";
            }
            if(i % 7 == 0){
                result += "Whizz";
            }
            results.add(result.length() == 0 ? String.valueOf(i) : result);
        }
    }

    public List<String> getResults() {
        return results;
    }
}


