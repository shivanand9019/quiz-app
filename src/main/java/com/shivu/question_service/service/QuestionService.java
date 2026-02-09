package com.shivu.question_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.shivu.question_service.models.Question;
import com.shivu.question_service.models.QuestionWrapper;
import com.shivu.question_service.repository.QuestionRepo;

@Service
public class QuestionService {
@Autowired
private QuestionRepo questionRepo;
    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(questionRepo.findAll(),HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public List<QuestionWrapper> getQuestionByCategory(String category) {
        return questionRepo.findByCategory(category);
    }
    public Question addQuestion(Question question) {
                               
        return questionRepo.save(question);
    }

}
