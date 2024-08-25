package com.coursework2.skypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ExaminerController {

    ExaminerServiceImpl examinerService;

    public ExaminerController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/get")
    public HashMap<Integer, Question> getQuestions(@RequestParam("count") int count) {
        return examinerService.getQuestion(count);
    }

}
