package com.aiinterview.interviewprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiinterview.interviewprep.models.Feedback;
public interface FeedbackRepo extends JpaRepository<Feedback, Long>{
}
