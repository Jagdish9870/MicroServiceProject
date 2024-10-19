package com.quiz.QuizService.Services;

import com.quiz.QuizService.Entities.Quizs;

import java.util.List;

public interface QuizService {
    Quizs add(Quizs quiz);
    List<Quizs> get();

    Quizs get(Long id); // to get single quiz
}
