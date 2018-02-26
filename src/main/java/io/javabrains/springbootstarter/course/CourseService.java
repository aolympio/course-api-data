package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {	
	
	@Autowired
	private CourseRepository couseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		couseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {		
		return couseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		couseRepository.save(course);
	}

	public void updateCourse(Course course) {
		couseRepository.save(course);		
	}

	public void removeCourse(String id) {
		couseRepository.delete(id);
	}
}