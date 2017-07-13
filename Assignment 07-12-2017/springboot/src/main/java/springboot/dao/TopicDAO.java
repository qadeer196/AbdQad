package springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import springboot.domain.Topic;

@Repository
public class TopicDAO {
	
	
	public List<Topic> getAllTopics() {
		List<Topic> theList = new ArrayList<Topic>();
		Topic t1 = new Topic(1, "Core Java", "Core Java Description");
		Topic t2 = new Topic(2, "Advance Java", "Advance Java Description");
		Topic t3 = new Topic(3, "Servlets", "Servlets Description");
		Topic t4 = new Topic(4, "JSP", "JSP Description");
		Topic t5 = new Topic(5, "Spring", "Spring Description");
		Topic t6 = new Topic(6, "Hibernate", "Hibernate Description");
		Topic t7 = new Topic(7, "Struts", "Struts Description");
		
		theList.add(t1);
		theList.add(t2);
		theList.add(t3);
		theList.add(t4);
		theList.add(t5);
		theList.add(t6);
		theList.add(t7);
		
		return theList;
	
	}

}
