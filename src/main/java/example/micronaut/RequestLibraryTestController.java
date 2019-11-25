package example.micronaut;

import com.google.gson.Gson;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller("/")
public class RequestLibraryTestController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/test")
    public HttpResponse<String> testEndPoint() {
        return HttpResponse.unauthorized();
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/test_secret/{data1}/data/level/text/v1.json")
    public HttpResponse<String> testSecretHeader(String data1, @QueryValue("kettle") String kettle,
                                                 @QueryValue("location") String location, @Header("api_key") String apiKey) {
        if(!apiKey.equals("56785685")) {
            return HttpResponse.unauthorized();
        }
        Map<String, String> success = new HashMap<>();
        success.put("message", "Authorization success");
        if(data1.equals("data1")) {
            if(kettle.equals("kettle1")) {
                if(location.equals("seattle")) {
                    return HttpResponse.ok(new Gson().toJson(success));
                }
            }
        } else if(data1.equals("data2")) {
            if (kettle.equals("kettle2")) {
                if (location.equals("boston")) {
                    return HttpResponse.ok(new Gson().toJson(success));
                }
            }
        } else if(data1.equals("data3")) {
            if (kettle.equals("kettle3")) {
                if (location.equals("american")) {
                    return HttpResponse.ok(new Gson().toJson(success));
                }
            }
        } else if(data1.equals("data4")) {
            if (kettle.equals("kettle4")) {
                if (location.equals("china")) {
                    return HttpResponse.ok(new Gson().toJson(success));
                }
            }
        }
        return HttpResponse.unauthorized();
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/test_bulk/single")
    HttpResponse<String> testBulkSingle() {
        Map<String, Object> body = new HashMap<>();
        Map<String, Double> magnitude = new HashMap<>();
        magnitude.put("magnitude", 0.8);
        Object[] magnitudeArr = new Object[2];
        magnitudeArr[0] = magnitude;
        magnitudeArr[1] = magnitude;
        body.put("magnitudeArr", magnitudeArr);
        Object[] scoreArr = new Object[2];
        body.put("scoreArr", scoreArr);
        Map<String, Double> score = new HashMap<>();
        score.put("score", 0.5);
        scoreArr[0] = score;
        scoreArr[1] = score;
        return HttpResponse.ok(new Gson().toJson(body));
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/test_bulk/multi")
    HttpResponse<String> testBulkMulti() {
        Map<String, Object> body = new HashMap<>();
        Map<String, Double> magnitude = new HashMap<>();
        magnitude.put("magnitude", 0.8);
        Object[] magnitudeArr = new Object[2];
        magnitudeArr[0] = magnitude;
        magnitudeArr[1] = magnitude;
        body.put("array", magnitudeArr);
        Object[] scoreArr = new Object[2];
        body.put("scoreArr", scoreArr);
        Map<String, Double> score = new HashMap<>();
        score.put("score", 0.5);
        scoreArr[0] = score;
        scoreArr[1] = score;
        return HttpResponse.ok(new Gson().toJson(body));
    }
}
