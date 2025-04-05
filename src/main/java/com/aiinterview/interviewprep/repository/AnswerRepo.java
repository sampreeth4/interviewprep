package com.aiinterview.interviewprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiinterview.interviewprep.models.Answer;
public interface AnswerRepo extends JpaRepository<Answer, Long>{
}
