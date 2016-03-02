
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import com.heroku.sdk.jdbc.DatabaseUrl;


/**
 * @class  Main
 * @author fabianantoniohoyospulido
 */
public class Main {

/**
 * @method main
 * 
 */
    public static void main(String[] args) {
        
        TestCase obj = new TestCase();    
        
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/LinearRegression", (req, res) -> {            
         return obj.Testing();                     
        });



        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());

        

    }

}