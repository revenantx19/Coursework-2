package com.coursework2.skypro;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private JavaQuestionService questionService;

    public JavaQuestionController(JavaQuestionService questionService) {
        this.questionService = questionService;
    }
    //Добавить вопрос в множество
    @GetMapping(path = "/java/add")
    public Question addQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }
    //Удалить вопрос из множества
    @GetMapping(path = "/java/remove")
    public Question removeQuestion(@RequestParam("number") int number) {
        return questionService.remove(number);
    }
    //Получить все вопросы
    @GetMapping(path = "/java")
    public HashMap<Integer, Question> getAllQuestion() {
        return questionService.getAll();
    }



}
