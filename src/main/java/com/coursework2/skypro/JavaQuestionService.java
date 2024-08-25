package com.coursework2.skypro;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    private Map<Integer, Question> mapOfQuestion = new HashMap<>();
    private Integer number = 1;
    private Random random = new Random();

    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        mapOfQuestion.put(number, question1);
        number++;
        return question1;
    }

    //удаляет и возвращает удаленный элемент
    public Question remove(int numberOfQuestion) {
        return mapOfQuestion.remove(numberOfQuestion);
    }
    //возвращает всю мапу с ключами и значениями
    public HashMap<Integer, Question> getAll() {
        return (HashMap<Integer, Question>) mapOfQuestion;
    }
    //генерирует случайный вопрос
    public Question getRandomQuestion() {
        return mapOfQuestion.get(random.nextInt(1, number));
    }

    public int getNumber() {
        return number;
    }

}
