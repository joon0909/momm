package site.jwhy.momm.momm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import site.jwhy.momm.momm.model.res.TestRes;
import site.jwhy.momm.momm.model.req.TestReq;
import site.jwhy.momm.momm.service.test.TestService;

@Slf4j
@RestController
public class TestController {
    private TestService testService;
    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }
    @GetMapping("/api/hello")
    public String hello(){
        return "Hello, world!";
    }
    @GetMapping("/api/test")
    public TestRes test(@ModelAttribute TestReq testReq) throws Exception {
        return testService.selectTest(testReq);
    }
}
