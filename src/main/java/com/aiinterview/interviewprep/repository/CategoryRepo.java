package com.aiinterview.interviewprep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiinterview.interviewprep.models.Category;
public interface CategoryRepo extends JpaRepository<Category, Long>{
}
