package com.coursework2.skypro;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QuestionService {

    Question add(String question, String answer);

    //Question add(Question question);

    Question remove(int number);

    HashMap<Integer, Question> getAll();

    Question getRandomQuestion();

}
