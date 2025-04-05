package com.aiinterview.interviewprep.repository;
import com.aiinterview.interviewprep.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
