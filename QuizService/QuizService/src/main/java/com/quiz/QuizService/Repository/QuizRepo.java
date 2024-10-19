package com.quiz.QuizService.Repository;

import com.quiz.QuizService.Entities.Quizs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quizs,Long> {

}
