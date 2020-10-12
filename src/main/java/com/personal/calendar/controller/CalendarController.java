package com.personal.calendar.controller;

//import com.personal.calendar.bean.UserCalendar;
//import com.personal.calendar.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/")
public class CalendarController {
//    @Autowired
//    private CalendarService remSer;

    @RequestMapping("")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


//    @PostMapping(value = "/save")
//   void save(@RequestBody UserCalendar cal){
//        remSer.save(cal);
//    }
//@GetMapping("/id/{title}/{type}/{account}")
//    Optional<UserCalendar> findById(@PathVariable String title,@PathVariable String type,@PathVariable String account){
//        UserCalendar.Title calTitle=new UserCalendar.Title();
//        calTitle.setTitle(title);
//        calTitle.setType(type);
//        calTitle.setAccount(account);
//        return remSer.findById(calTitle);
//    }
//@GetMapping("/account/{account}")
//ArrayList<UserCalendar> findAllByAccount(@PathVariable String account){return  remSer.findByAccount(account);}
//    @GetMapping("/archived/{status}/{account}")
//    ArrayList<UserCalendar> findByArchive(@PathVariable Boolean status,@PathVariable String account){
//        return remSer.findByArchive(status,account);
//}
//@GetMapping("/type/{type}/{account}")
//    ArrayList<UserCalendar> findByType(@PathVariable String type,@PathVariable String account){
//        return remSer.findByType(type,account);
//}
//@GetMapping("/tag/{value}/{account}")
//    ArrayList<UserCalendar> findByTags(@PathVariable String value, @RequestBody UserCalendar cal){
//        return remSer.findByTags(value,cal.getTitle().getAccount());
//}
//@GetMapping("/title/{title}/{account}")
//    ArrayList<UserCalendar> findByName(@PathVariable String title,@PathVariable String account){
//
//        return remSer.findByTitle(title, account);
//}
//@GetMapping("/targetdate/{targetDate}/{type}/{account}")
//    ArrayList<UserCalendar> findByTargetDateAndType(@PathVariable String targetDate,@PathVariable String type,@PathVariable String account){
//        return remSer.findByTargetDateAndType(targetDate,type,account);
//}
}
