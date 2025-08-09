package com.wipro.lakshman.service;

import java.util.List;

import com.wipro.lakshman.entities.QuestionWrapper;
import com.wipro.lakshman.entities.Quiz;
import com.wipro.lakshman.entities.Response;

public interface Quizservice {

    Quiz createQuiz(String category, String level, String title);

    List<QuestionWrapper> getQuizquestions(Long id);

    Integer calculateResult(int id, List<Response> responses);
}
