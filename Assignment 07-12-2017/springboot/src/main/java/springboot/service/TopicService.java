package springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.dao.TopicDAO;
import springboot.domain.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicDAO topicDAO;
	
	public List<Topic> getAllTopics() {
		return topicDAO.getAllTopics();
		
	}
	
	
	
}
