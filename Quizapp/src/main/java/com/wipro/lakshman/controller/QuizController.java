package com.wipro.lakshman.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.wipro.lakshman.entities.QuestionWrapper;
import com.wipro.lakshman.entities.Quiz;
import com.wipro.lakshman.entities.Response;
import com.wipro.lakshman.service.Quizservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/quiz")
public class QuizController {

    private final Quizservice quizservice;

    @PostMapping("/create")
    public Quiz createquiz(
            @RequestParam String category,
            @RequestParam String level,
            @RequestParam String title) {
        return quizservice.createQuiz(category, level, title);
    }

    @GetMapping("/getquizbyid/{id}")
    public List<QuestionWrapper> getQuizQuestions(@PathVariable Long id) {
        return quizservice.getQuizquestions(id);
    }

    @PostMapping("/submitQuiz/{id}")
    public Integer submitQuiz(@PathVariable int id, @RequestBody List<Response> responses) {
        return quizservice.calculateResult(id, responses);
    }
}
