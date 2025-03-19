package com.openai.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Answer {

    private String answer;

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }


    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
