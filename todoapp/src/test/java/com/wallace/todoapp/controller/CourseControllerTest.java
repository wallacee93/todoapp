//package com.wallace.todoapp.controller;
//
//import com.wallace.todoapp.BaseControllerTest;
//import com.wallace.todoapp.model.Course;
//import com.wallace.todoapp.model.User;
//import com.wallace.todoapp.services.CourseService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//public class CourseControllerTest extends BaseControllerTest {
//
//    @MockBean
//    private CourseService mockCourseService;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private Course inputCourse;
//
//    private Course mockResponseCourse1;
//
//    private Course mockResponseCourse2;
//
//    private List<Course> courseList;
//
//    @BeforeEach
//    public void setUp(){
//
//        inputCourse = new Course("Python I", "The Basics of Python", "part-time", "pythonLover3");
//
//        mockResponseCourse1 = new Course("Javascript I", "Everything on Javascript", "full-time", "whyJavascript");
//        mockResponseCourse1.setId(1L);
//
//        mockResponseCourse2 = new Course("Java I", "What you need to know on Java", "full-time", "javaThisOrThat");
//        mockResponseCourse2.setId(2L);
//
//        courseList.add(mockResponseCourse1);
//        courseList.add(mockResponseCourse2);
//    }
//
//    @Test
//    @DisplayName("Course GET ALL: /  ")
//    public void getAllCoursesRequestTest() throws Exception{
//
//        BDDMockito.doReturn(courseList).when(mockCourseService).getCourses();
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/"))
//                .andExpect();
//    }
//}
