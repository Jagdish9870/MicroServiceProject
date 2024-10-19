package com.quiz.QuizService.Services.Implement;

import com.quiz.QuizService.Entities.Questions;
import com.quiz.QuizService.Entities.Quizs;
import com.quiz.QuizService.Repository.QuizRepo;
import com.quiz.QuizService.Services.QuestionCallingClient;
import com.quiz.QuizService.Services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuestionCallingClient questionCallingClient;

    private final QuizRepo quizRepo;

    public QuizServiceImpl(QuestionCallingClient questionCallingClient, QuizRepo quizRepo) {
        this.questionCallingClient = questionCallingClient;
        this.quizRepo = quizRepo;
    }

    @Override
    public Quizs add(Quizs quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quizs> get() {
        List<Quizs> quizzes=quizRepo.findAll();

        List<Quizs> newQuizList = quizzes.stream().map(quizs -> {
            quizs.setQuestions(questionCallingClient.getQuestionsOfQuiz(quizs.getId()));
            return quizs;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quizs get(Long id) {

                Quizs quizOne=quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
                quizOne.setQuestions(questionCallingClient.getQuestionsOfQuiz(quizOne.getId()));
                return quizOne;

    }

}
