package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService CourseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page" ;
	}
//	get all course
	@GetMapping("/courses")
	public List<Course> getCources(){
		return this.CourseService.getCources();
		
	}
//	get course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.CourseService.getCourse(Long.parseLong(courseId));
		
	}
//	add course 
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.CourseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse( @RequestBody Course courses) {
		return this.CourseService.updateCourse(courses);
	}
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
	     this.CourseService.deleteCourse(Long.parseLong(courseId));
	    return "deleted successfully";
	}
	

}
