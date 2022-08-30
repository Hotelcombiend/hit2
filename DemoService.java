package com.example.service_f_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class DemoService {
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloworld(){
        return "Helloworld";
    }
    @RequestMapping(value = "/helloworld/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable("name") String firstname){
        return  "Hello " + firstname;
    }
}
