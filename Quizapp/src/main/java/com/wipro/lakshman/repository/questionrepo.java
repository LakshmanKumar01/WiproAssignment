package com.wipro.lakshman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.lakshman.entities.CategoryLevel;
import com.wipro.lakshman.entities.DifficultyLevel;
import com.wipro.lakshman.entities.Question;


public interface questionrepo extends JpaRepository<Question, Long> {

    List<Question> findByCategoryAndDifficulty(CategoryLevel categoryEnum, DifficultyLevel levelEnum);

}
