package com.example.myproject.turf.Contact;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConController {

   @Autowired
   ConService co;

   @GetMapping("/surigetAll")
 //get the value from database
   public List<ConEntity> sabsgetAl1() {
       return co.suri();
   }

   @PostMapping("/suripostAll")
 //posting the value from postman to mysqldatabase 
   public String sabsgetAll(@RequestBody ConEntity cc) {
       co.suriPost(cc);
       return "Posted Successfully";
   }
}