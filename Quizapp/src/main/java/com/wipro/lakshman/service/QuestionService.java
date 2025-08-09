package com.wipro.lakshman.service;

import java.util.List;

import com.wipro.lakshman.entities.Question;
public interface QuestionService {

	List<Question> getquestions();

	Question save(Question question);

	

	Question patchupdatequestions(Long id, Question question);

	void  deletequestion(Long id);

	

}
