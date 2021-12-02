package com.wallace.todoapp.controller;

import com.wallace.todoapp.model.Course;
import com.wallace.todoapp.services.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    private final Logger logger = LoggerFactory.getLogger(CourseController.class);

    // POST
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        logger.info("Course object {}", course.toString());
        return courseService.saveCourse(course);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses){
         return courseService.saveCourses(courses);
    }

    // GET
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courseById/{id}")
    public Course findCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/courseByName/{name}")
    public Course findCourseByName(@PathVariable String name){
       return courseService.getCourseByName(name);
    }

    @GetMapping("/allCourseByUsername/{username}")
    public List<Course> findBourseByUsername(@PathVariable String username){
       return courseService.getCoursesForUser(username);
    }

    // PUT
    @PutMapping("/updateCourse")
    public Course updateCourse (@RequestBody Course course){
        System.out.println("Course has been Updated");
        return courseService.updateCourse(course);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id){
        return courseService.deleteCourse(id);
    }
}
