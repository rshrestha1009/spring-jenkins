package com.restExample.restfulwebservice.HelloWorld;

import com.restExample.restfulwebservice.HelloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "HELLO WORLD";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean hellowWorldBean(){
        return new HelloWorldBean("Hello, World!");
    }

    @GetMapping("/hello/{name}")
    public HelloWorldBean hellowWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
