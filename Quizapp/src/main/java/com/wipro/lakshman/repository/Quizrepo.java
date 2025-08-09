package com.wipro.lakshman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.lakshman.entities.Quiz;

public interface Quizrepo extends JpaRepository<Quiz, Long> {

}
