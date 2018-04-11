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

    @Test
    public void should_return_Buzz_when_multiples_5(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(4), is("Buzz"));
        assertThat(results.get(9), is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_multiples_7(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(6), is("Whizz"));
        assertThat(results.get(13), is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_multiples_3_and_5(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(14), is("FizzBuzz"));
        assertThat(results.get(44), is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_multiples_3_and_7(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(20), is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_multiples_5_and_7(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(69), is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiples_3_and_5_and_7(){
        fizzBuzzGame.start(105);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(104), is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_when_contains_3(){
        fizzBuzzGame.start(100);
        results = fizzBuzzGame.getResults();

        assertThat(results.get(2), is("Fizz"));
        assertThat(results.get(29), is("Fizz"));
        assertThat(results.get(34), is("Fizz"));
    }

}
