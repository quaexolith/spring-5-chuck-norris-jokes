package com.josavish.chucknorrisjokes.jokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotes;

    JokesService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    String findRandomJoke() {
        return quotes.getRandomQuote();
    }
}
