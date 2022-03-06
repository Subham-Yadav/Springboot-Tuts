package com.example.demo.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{	//<Entity, Primary Key data type>

	
}
