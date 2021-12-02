package com.wallace.todoapp.models;

import com.wallace.todoapp.model.Course;
import com.wallace.todoapp.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    private Course course1;
    private Course course2;

    private Course emptyCourse1;
    private Course emptyCourse2;

    @BeforeEach
    public void setUp(){

        emptyCourse1 = new Course();
        emptyCourse2 = new Course();

        course1 = new Course("Intro IT", "Basics of Information Technology", "full-time", "t.ang1");
        course1.setId(1L);

        course2 = new Course("Java", "Basics of Java", "part-time", "l.njg1");
        course2.setId(2L);

    }

    @Test
    public void courseEmptyEquals() throws Exception{

        assertFalse(
                emptyCourse1.equals(emptyCourse2),
                "Both empty Course instances should be equal"
        );
    }

    @Test
    public void courseTestContentEquals() throws Exception{

        assertFalse(
                course1.equals(course2),
                "Both non-empty Course instances should be equal"
        );
    }

    @Test
    public void courseTestNotEqual() throws Exception{

        assertFalse(
                emptyCourse1.equals(course1),
                "The Course instances should not be equal"
        );
    }

    @Test
    public void courseTestEmptyToString() throws Exception{

        assertEquals(
                emptyCourse1.toString(),
                emptyCourse2.toString(),
                "Both empty Course instances should have the same toString"
        );
    }

    @Test
    public void courseContentToString() throws Exception{

        assertNotEquals(
                course1.toString(),
                course2.toString(),
                "Both non-empty Course instances should have the same toString"
        );
    }

    @Test
    public void courseTestNotToString() throws Exception{

        assertNotEquals(
                emptyCourse1.toString(),
                course2.toString(),
                "The Course instances should not have the same toString"
        );
    }
}
