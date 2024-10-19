package com.quiz.QuizService.Services;

import com.quiz.QuizService.Entities.Questions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url="http://localhost:8080",value="Question-Client")

@FeignClient(name="QuizService")
public interface QuestionCallingClient {

    @GetMapping("/questions/quiz/{quizId}")
    List<Questions> getQuestionsOfQuiz(@PathVariable long quizId);
}

