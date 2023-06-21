import org.springframework.web.bing.annotation.GetMapping;
import org.springframework.web.bing.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World</h1>";
    }

}
