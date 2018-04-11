package com.thoughtworks;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {

    private FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
    private List<String> results = fizzBuzzGame.getResults();

    @Test
    public void should_return_Fizz_when_multiples_3() {
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(2), is("Fizz"));
        assertThat(results.get(5), is("Fizz"));
    }
}
