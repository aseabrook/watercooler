package services;

import models.Topic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aaron on 17/5/2017.
 */
public class TopicService {


    public List<Topic> getTopics() {
        Topic s = new Topic();

        List sessions = new ArrayList<Topic>();
        sessions.add(s);
        return sessions;
    }



}
