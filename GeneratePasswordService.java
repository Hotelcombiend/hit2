package com.example.service_f_1;

import org.springframework.web.bind.annotation.*;


@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String Gen_pass(@PathVariable("name") String name){
        int pass_rand = (int)(Math.random() * 999999999);
        return "Hi, " + name  + "Your new Password is " + pass_rand;
    }
}
