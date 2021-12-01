package com.wallace.todoapp.repos;

import com.wallace.todoapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

    Course findByName(String name);

    List<Course> findAllByUsername(String username);

}
