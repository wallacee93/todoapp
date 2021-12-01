package com.wallace.todoapp.services;

import com.wallace.todoapp.model.Course;
import com.wallace.todoapp.repos.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    //POST
    public Course saveCourse(Course course){
        System.out.println(course);
        return courseRepo.save(course);
    }

    // POST ALL
    public List<Course> saveCourses(List<Course> courses){
        return courseRepo.saveAll(courses);
    }

    // GET ALL
    public List<Course> getCourses(){
        return courseRepo.findAll();
    }

    // GET ById
    public Course getCourseById(Long id){
        return courseRepo.findById(id).orElse(null);
    }

    // GET ByName
    public Course getCourseByName(String name){
        return courseRepo.findByName(name);
    }

    // GET ByUser
    public List<Course> getCoursesForUser(String username){
        return courseRepo.findAllByUsername(username);
    }

    // PUT
    public Course updateCourse(Course course){
        System.out.println("Course Updates");
        Course existingCourse = courseRepo.findById(course.getId()).orElse(null);
        assert existingCourse != null;
        existingCourse.setName(course.getName());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setStatus(course.getStatus());
        return courseRepo.save(existingCourse);
    }

    // DELETE
    public String deleteCourse(Long id){
        courseRepo.deleteById(id);
        return id + " course has been removed/completed";
    }
}
