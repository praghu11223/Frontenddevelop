package com.example.myproject.turf.Review;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {

    @Autowired
    private RevService rs;

    @GetMapping("/tharungetAll")
  //get the value from database
    public List<RevEntity> getAllFields() {
        return rs.tharun();
    }

    @PostMapping("/tharunpostAll")
  //posting the value from postman to mysqldatabase 
    public String postField(@RequestBody RevEntity fe) {
        rs.pragapost(fe);
        return "Posted Successfully";
    }
}