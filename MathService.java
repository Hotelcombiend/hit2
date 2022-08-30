package com.example.service_f_1;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{f_num}/{l_num}", method = RequestMethod.GET)
    public String add(@PathVariable("f_num") double num_1,
                      @PathVariable("l_num") double num_2){
        return  num_1+num_2 + "";
    }
    @RequestMapping(value = "/minus/{f_num}/{l_num}", method = RequestMethod.GET)
    public String minus(@PathVariable("f_num") double num_1,
                        @PathVariable("l_num") double num_2){
        return num_1 - num_2 + "";
    }
    @RequestMapping(value = "/mutiply", method = RequestMethod.GET)
    public String mutiply(@RequestParam("num1") double num_1,
                          @RequestParam("num2") double num_2){
        return (num_1 * num_2) + "";
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") double num_1,
                         @RequestParam("num2") double num_2){
        return (num_1 / num_2) + "";
    }
}

