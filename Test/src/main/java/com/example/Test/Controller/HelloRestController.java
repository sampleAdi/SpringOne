package com.example.Test.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.Test.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!";
    }

    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
}
