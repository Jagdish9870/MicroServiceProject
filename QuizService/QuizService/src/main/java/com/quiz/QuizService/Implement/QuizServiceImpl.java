package com.quiz.QuizService.Implement;

import com.quiz.QuizService.Entities.Quizs;
import com.quiz.QuizService.Repository.QuizRepo;
import com.quiz.QuizService.Services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    private QuizRepo quizRepo;
    public QuizServiceImpl(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }

   
    
    @Override
    public Quizs add(Quizs quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quizs> get() {
        return quizRepo.findAll();
    }

    @Override
    public Quizs get(Long id) {
        return quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));

    }
}
