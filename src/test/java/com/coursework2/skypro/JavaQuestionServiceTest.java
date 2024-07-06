package com.coursework2.skypro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {

    @Mock
    private final Random random = new Random();


    @InjectMocks
    JavaQuestionService javaQuestionService = new JavaQuestionService();



    private String question = "Лучший язык программирования?";
    private String answer = "Java";

    @Test
    void add() {
        Question result = javaQuestionService.add(question, answer);
        assertTrue(javaQuestionService.getAll().containsValue(result));
    }

    @Test
    void remove() {
        Question result = javaQuestionService.remove(1);
        assertFalse(javaQuestionService.getAll().containsValue(result));
    }

    @Test
    void getAll() {
        Question result = javaQuestionService.add(question, answer);
        assertTrue(javaQuestionService.getAll().containsValue(result));
    }

    @Test
    void getRandomQuestion() {
        Question add = javaQuestionService.add(question, answer);
        when(random.nextInt(anyInt(), anyInt())).thenReturn(1);
        Question result = javaQuestionService.getRandomQuestion();
        assertTrue(javaQuestionService.getAll().containsValue(result));
    }

    @Test
    void getNumber() {
        Question add = javaQuestionService.add(question, answer);
        int result = javaQuestionService.getNumber();
        assertEquals(2, result);
    }
}