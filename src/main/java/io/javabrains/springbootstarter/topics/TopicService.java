package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "JavaScript", "JavaScript Description"));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
//		for (Topic topic : topics) {
//			if (topic.getId().equals(id)) {
//				return topic;
//			}
//		}
//		throw new IllegalArgumentException("");
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
