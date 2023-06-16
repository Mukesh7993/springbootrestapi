package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	
	  @Autowired private CourseDao courseDao;
	 
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"sql","database language"));
		list.add(new Course(146,"python","Scripting language"));

	}

	@Override
	public List<Course> getCources() {
		
		return  courseDao.findAll();
		// TODO Auto-generated method stub
//	return list;
	}
	@Override
	public Course getCourse(long parsLong) {
		Course entity=courseDao.findById(parsLong).get();
	    return entity;
	}
	
	

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		
//     list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteCourse(long parsLong) {
		// TODO Auto-generated method stub
		Course entity=courseDao.getOne(parsLong);
		courseDao.delete(entity);
	}

	

	
	
	

}
