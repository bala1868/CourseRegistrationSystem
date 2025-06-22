package com.example.CourseRegistrationSystem.repo;

import com.example.CourseRegistrationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {

}
