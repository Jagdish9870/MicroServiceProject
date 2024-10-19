package com.question.QuestionService.impl;

import com.question.QuestionService.Entities.Questions;
import com.question.QuestionService.Repositories.QuestionRepo;
import com.question.QuestionService.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceimpl implements QuestionService {
    private QuestionRepo questionRepo;

    public QuestionServiceimpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Questions create(Questions questions) {
        return questionRepo.save(questions);
    }

    @Override
    public List<Questions> getAll() {
        return questionRepo.findAll();
    }

    @Override
    public Questions getOne(Long id) {
        return questionRepo.findById(id).orElseThrow(()->new RuntimeException("question not find"));
    }

    @Override
    public List<Questions> getQuestionsOfQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
