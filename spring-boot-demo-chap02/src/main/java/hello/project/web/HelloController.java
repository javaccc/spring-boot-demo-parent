package hello.project.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {


    @RequestMapping({"/", "/home"})
    public String index() {
        return "Hello, Spring Boot!";
    }
}
