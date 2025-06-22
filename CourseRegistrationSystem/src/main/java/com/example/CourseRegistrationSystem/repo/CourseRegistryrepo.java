package com.example.CourseRegistrationSystem.repo;

import com.example.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryrepo extends JpaRepository<CourseRegistry,Integer> {

}
