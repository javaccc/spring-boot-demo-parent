package hello.project.controller;

import hello.project.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @Autowired
    private AppConfiguration appConfiguration;

    @RequestMapping({"/", "/home"})
    public String index() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping("/getConf")
    public AppConfiguration getConf() {
        return appConfiguration;
    }
}
