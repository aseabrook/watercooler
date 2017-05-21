import Controller.TopicsController;
import services.TopicService;

import static spark.Spark.after;

/**
 * Created by aaron on 17/5/2017.
 */
public class Main {

    public static void main(String[] args) {
        new TopicsController(new TopicService());

        after((req, res) -> {
            res.type("application/json");
        });
    }

}
