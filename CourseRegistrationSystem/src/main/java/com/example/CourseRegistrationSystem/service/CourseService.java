package com.example.CourseRegistrationSystem.service;


import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repo.CourseRegistryrepo;
import com.example.CourseRegistrationSystem.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

@Autowired
    CourseRepo courseRepo;
@Autowired
    CourseRegistryrepo courseRegistryrepo;

    public List<Course> availableCourses() {
      return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryrepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
        courseRegistryrepo.save(courseRegistry);
    }
}
