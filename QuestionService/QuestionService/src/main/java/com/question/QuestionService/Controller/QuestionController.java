package com.question.QuestionService.Controller;

import com.question.QuestionService.Entities.Questions;
import com.question.QuestionService.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // to create
    @PostMapping
    public Questions create(@RequestBody Questions questions){
        return questionService.create(questions);
    }
    // getAll
    @GetMapping
    public List<Questions> get(){
        return questionService.getAll();
    }


    // to get one question only by id
    @GetMapping("/{id}")
    public Questions getOne(@PathVariable Long id){
        return questionService.getOne(id);
    }
    //get all question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Questions> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
