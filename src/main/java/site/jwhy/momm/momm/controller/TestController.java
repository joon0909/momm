package site.jwhy.momm.momm.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class TestController {
    @GetMapping("/api/hello")
    public String test(){
        return "Hello, world!";
    }
}
