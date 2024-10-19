package com.question.QuestionService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class testController {

    @GetMapping
    public String quizTest(){
        return "this is quiz controller";

    }

}
