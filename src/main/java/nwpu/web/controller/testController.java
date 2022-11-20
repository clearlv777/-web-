package nwpu.web.controller;

import nwpu.web.domain.Test;
import nwpu.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/test")
    public void test(){
        System.out.println("test success");
    }

    @Autowired
    private TestService testService;

    @PostMapping
    public boolean save(@RequestBody Test test){
        return testService.save(test);
    }
}
