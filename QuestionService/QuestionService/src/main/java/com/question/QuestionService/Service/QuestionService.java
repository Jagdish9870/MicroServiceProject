package com.question.QuestionService.Service;

import com.question.QuestionService.Entities.Questions;

import java.util.List;

public interface QuestionService {
    Questions create(Questions questions);
    List<Questions> getAll();
    Questions getOne(Long id);
    List<Questions> getQuestionsOfQuiz(Long quizId);
}
