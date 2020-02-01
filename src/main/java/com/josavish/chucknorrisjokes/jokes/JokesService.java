package com.josavish.chucknorrisjokes.jokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes quotes;

    JokesService() {
        quotes = new ChuckNorrisQuotes();
    }

    String findRandomJoke() {
        return quotes.getRandomQuote();
    }
}
