package services;

import com.google.gson.Gson;
import spark.ResponseTransformer;

import java.util.List;

/**
 * Created by aaron on 17/5/2017.
 */
public class APIHelper {

    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

    public static ResponseTransformer json() {
        return APIHelper::toJson;
    }
}
