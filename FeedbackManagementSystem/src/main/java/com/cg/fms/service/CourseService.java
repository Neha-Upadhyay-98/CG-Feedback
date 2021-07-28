package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Course;
import com.cg.fms.exception.CourseNotFoundException;
import com.cg.fms.repository.ICourseRepository;

@Service
public class CourseService {

	@Autowired
	private ICourseRepository courserepository;

	public Course addCourse(Course course) {
		return this.courserepository.save(course);
	}

	public Course updateCourse(Course course, String courseId) {
		Course existingcourse = this.courserepository.findById(courseId).get();
				//.orElseThrow(() -> new CourseNotFoundException("Course not found with id " + courseId));
		existingcourse.setCourseName(course.getCourseName());
		existingcourse.setCourseDescription(course.getCourseDescription());
		existingcourse.setNoOfDays(course.getNoOfDays());
		return this.courserepository.save(existingcourse);
	}

	public ResponseEntity<Course> removeCourse(String courseId) {
		Course existingcourse = this.courserepository.getById(courseId);
		this.courserepository.delete(existingcourse);
		return ResponseEntity.ok().build();
	}

	public Course viewCourseById(String courseId) {
		return this.courserepository.findById(courseId)
				.orElseThrow(() -> new CourseNotFoundException("Course not found with id " + courseId));
	}
	
	public List<Course> viewAllCourses() {
		return this.courserepository.findAll();
	}
	
}