package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("strings")
public class StringController{
    @GetMapping
    public String doubleString(@RequestParam String a,@RequestParam(required = false) String b){
        if(b == null){
            return a;
        }
        return a+b;
    }
}