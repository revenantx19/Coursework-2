package com.coursework2.skypro;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private final JavaQuestionService questionService = new JavaQuestionService();

    @InjectMocks
    ExaminerServiceImpl examinerService;



    @Test
    void getQuestion() {

        Question question = new Question("Java", "Лучший язык программирования?");
        when(questionService.getRandomQuestion()).thenReturn(question);
        questionService.getRandomQuestion();
        when(questionService.getNumber()).thenReturn(1);
        questionService.getNumber();
        HashMap<Integer, Question> map = new HashMap<>();
        HashMap<Integer, Question> mapRandom = examinerService.getQuestion(0);

        assertEquals(map, mapRandom);

    }
}