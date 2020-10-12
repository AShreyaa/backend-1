package com.personal.calendar.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CalendarController {


    @RequestMapping("")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
