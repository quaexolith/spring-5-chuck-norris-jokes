package com.josavish.chucknorrisjokes.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", jokesService.findRandomJoke());

        return "chuck-norris";
    }
}
