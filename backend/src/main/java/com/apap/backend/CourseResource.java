package com.apap.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseResource {
    @Autowired
    private CourseService courseManagementService;

    @GetMapping("/course/{name}")
    public List<Course> getAllCourses(@PathVariable String name) {
        return courseManagementService.findAll();
    }
}