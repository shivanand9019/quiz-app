package com.shivu.question_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivu.question_service.models.Question;
import com.shivu.question_service.models.QuestionWrapper;
import com.shivu.question_service.service.QuestionService;

@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;
@GetMapping("/questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
        
    }
    @GetMapping("/questions/category/{category}")
    public List<QuestionWrapper> getQuestionByCategory(@PathVariable(value = "category") String category){
return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/questions/add")
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    
}
