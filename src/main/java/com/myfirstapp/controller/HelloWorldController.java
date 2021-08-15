package com.myfirstapp.controller;

import com.myfirstapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam (value = "name") String name) {
        return "Hello " + name + " !";
    }

    @GetMapping(value = "/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " !";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + " " + "!";
    }
}
