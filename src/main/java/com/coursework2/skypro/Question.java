package com.coursework2.skypro;

import java.util.Objects;

public class Question {

    private String answer;
    private String question;

    public Question(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(answer, question1.answer) && Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, question);
    }

    @Override
    public String toString() {
        return "Question{" +
                "answer='" + answer + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
