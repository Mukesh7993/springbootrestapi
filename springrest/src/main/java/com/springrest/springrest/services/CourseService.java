package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCources();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course existingCourse);

	public void deleteCourse(long existingCourse);
}
