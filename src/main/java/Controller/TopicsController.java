package Controller;

import services.APIHelper;
        import services.TopicService;

        import static spark.Spark.*;

public class TopicsController {

    public TopicsController(final TopicService service) {

        get("/topics/", (req, res) -> service.getTopics(), APIHelper.json());

    }
}

