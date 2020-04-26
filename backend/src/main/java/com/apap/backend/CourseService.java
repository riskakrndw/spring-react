package com.apap.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private static List<Course> courses = new ArrayList<>();
    private static long id = 0;

    static{
        courses.add(new Course(++id, "APAP", "Learn Spring Boot"));
        courses.add(new Course(++id, "APAP", "Learn React"));
        courses.add(new Course(++id, "APAP", "Learn Full stack with Spring"));
        courses.add(new Course(++id, "APAP", "Deploy to Heroku"));
    }

    public List<Course> findAll(){
        return courses;
    }
}