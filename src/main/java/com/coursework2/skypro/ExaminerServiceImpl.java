package com.coursework2.skypro;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private Map<Integer, Question> randomMapOfQuestion = new HashMap<>();
    private Integer number = 1;
    private JavaQuestionService questionService;

    public ExaminerServiceImpl(JavaQuestionService questionService) {
        this.questionService = questionService;
    }

    public HashMap<Integer, Question> getQuestion(int amount) {
        if (amount > questionService.getNumber()) {
            throw new RuntimeException("BAD_REQUEST");
        }
        randomMapOfQuestion.clear();
        number = 1;
        for (int i = 0; i < amount; i++) {
            //получаем радомный вопрос и кладём в новую мапу
            randomMapOfQuestion.put(number, questionService.getRandomQuestion());
            number++;
        }
        return (HashMap<Integer, Question>) randomMapOfQuestion;
    }

}
