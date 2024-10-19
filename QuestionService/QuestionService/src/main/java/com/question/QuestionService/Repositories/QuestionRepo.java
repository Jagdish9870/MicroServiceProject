package com.question.QuestionService.Repositories;

import com.question.QuestionService.Entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Questions,Long> {
    List<Questions> findByQuizId(Long quizId);
}
