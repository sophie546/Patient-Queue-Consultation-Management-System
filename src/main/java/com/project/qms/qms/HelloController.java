package com.project.qms.qms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController { 

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
        //comment in here <----
    }

    @GetMapping("/hi")
    public String hi(){
        return "hello world";   
    }

}