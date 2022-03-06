package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{	//<Entity, Primary Key data type>

	
}
