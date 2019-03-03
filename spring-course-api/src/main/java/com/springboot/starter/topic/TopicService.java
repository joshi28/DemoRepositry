package com.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

		private List<Topic> topics =  new ArrayList<>(Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring with the boot"),
				new Topic("JavaScript", "Javascript Framework", "Javascript with Jquery")
				));
		
		public List<Topic> getAlltopics(){
			return topics;
		}
		
		public Topic getTopicWithId(String id) {
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
		}

		public void addTopic(Topic topic) {
			topics.add(topic);
		}

		public void updateTopic(Topic topic, String id) {
			for(int i=0; i<topics.size();i++) {
				Topic t= topics.get(i);
				if(t.getId().equals(id)) {
					topics.set(i, topic);
					return;
				}
			}
			
		}

		public void deleteTopic(String id) {
			for(int i=0; i<topics.size();i++) {
				Topic t= topics.get(i);
				if(t.getId().equals(id)) {
					topics.remove(i);
					return;
				}
			}
		}
}
