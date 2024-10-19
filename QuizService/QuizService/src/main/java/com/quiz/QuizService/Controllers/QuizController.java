package com.quiz.QuizService.Controllers;

import com.quiz.QuizService.Entities.Quizs;
import com.quiz.QuizService.Services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // to create
    @PostMapping
    public Quizs create(@RequestBody Quizs quizs){
        return quizService.add(quizs);
    }
    // getAll
    @GetMapping
    public List<Quizs> get(){
        return quizService.get();
    }


    // to get one quiz only by id
    @GetMapping("/{id}")
    public Quizs getOne(@PathVariable Long id){
        return quizService.get(id);
    }

}
