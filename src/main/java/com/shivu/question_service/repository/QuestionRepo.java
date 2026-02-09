package com.shivu.question_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.shivu.question_service.models.Question;
import com.shivu.question_service.models.QuestionWrapper;
@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
public List<QuestionWrapper> findByCategory(String category);

@Query(value = "SELECT * FROM question WHERE category=:category ORDER BY RANDOM() LIMIT :numQuestions", nativeQuery = true)
public List<Question> findRandomQuestionByCategory(String category, int numQuestions);
}
