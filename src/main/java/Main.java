

import java.io.File;
import java.nio.file.Files;
import static spark.Spark.*;


 
/**
 *
 * @author roman
 */
public class Main {
    
    public static void main(String[] args) {
        
        get("/roman", (req, res) -> "hola roman");
        
        get("/", (request, response) -> { 
            return new String(Files.readAllBytes(new File("newhtml.html").toPath()));           
        });
    }
}