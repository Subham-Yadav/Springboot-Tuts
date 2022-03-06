package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
//			new Topic("Java", "Java Framework", "Java Framework Description"),
//			new Topic("JS", "JS Framework", "JS Framework Description")
//			));
	
	public List<Topic> getAllTopics(){
		List<Topic> topicss = new ArrayList<>();
		topicRepository.findAll().forEach(topicss::add);
		return topicss;
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t-> t.getId().equalsIgnoreCase(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
//		for(int i=0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equalsIgnoreCase(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		topicRepository.deleteById(id);
	}
}
