package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
//			new Topic("Java", "Java Framework", "Java Framework Description"),
//			new Topic("JS", "JS Framework", "JS Framework Description")
//			));
	
	public List<Course> getAllCourses(){
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
		//return topics.stream().filter(t-> t.getId().equalsIgnoreCase(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(String id, Course course) {
//		for(int i=0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equalsIgnoreCase(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		courseRepository.deleteById(id);
	}
}
