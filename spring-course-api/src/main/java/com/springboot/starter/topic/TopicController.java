package com.springboot.starter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicSevices;
	
	
	
	@RequestMapping("/topic")
	public List<Topic> getAlltopics(){
		return topicSevices.getAlltopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopicWithId(@PathVariable String id) {
		
		return topicSevices.getTopicWithId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicSevices.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicSevices.updateTopic(topic,id);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
			topicSevices.deleteTopic(id);
	}
}
