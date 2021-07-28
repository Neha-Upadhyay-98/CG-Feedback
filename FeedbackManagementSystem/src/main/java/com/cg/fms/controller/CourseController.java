package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Course;
import com.cg.fms.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	public CourseService courseService;
	
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/updatecourse/{id}")
	public Course updateCourse(@RequestBody Course course, @PathVariable("id") String courseId) {
		return this.courseService.updateCourse(course, courseId);
	}
	
	@DeleteMapping("/deletecourse/{id}")
	public ResponseEntity <Course> removeCourse(@PathVariable("id") String courseId) {
		return this.courseService.removeCourse(courseId);
	}
	
	@GetMapping("/getcourse")
	public List<Course> viewAllCourses() {
		return this.courseService.viewAllCourses();
	}
	
	@GetMapping("/getcoursebyid/{id}")
	public Course viewCourseById(@PathVariable("id") String courseId) {
		return this.courseService.viewCourseById(courseId);
	}
	
}