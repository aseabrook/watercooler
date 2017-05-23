import Controller.TopicsController;
import org.javalite.activejdbc.Base;
import services.TopicService;
import spark.Spark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

/**
 * Created by aaron on 17/5/2017.
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // link to DB
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test", "the_user", "the_password");

        before((req, res) -> {
            logger.info(req.requestMethod() + " " + req.uri());
        });

        before((req, res) -> {
            res.header("Access-Control-Allow-Headers", "Authorization, Content-Type");
            res.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            res.header("Access-Control-Allow-Origin", "*");
        });

        options("/*", (req, res) -> "");

        new TopicsController(new TopicService());

        exception(Exception.class, (e, req, res) -> {
            String message = e.getClass().getName() + ": " + e.getMessage();
            logger.error(message);
            res.type("application/json");
            res.status(500);
            res.body(message);
        });

    }

}
