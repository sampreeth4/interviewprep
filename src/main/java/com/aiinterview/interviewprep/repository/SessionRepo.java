package com.aiinterview.interviewprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiinterview.interviewprep.models.Session;
public interface SessionRepo extends JpaRepository<Session, Long>{
}
