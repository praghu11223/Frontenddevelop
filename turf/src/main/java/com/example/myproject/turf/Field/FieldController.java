package com.example.myproject.turf.Field;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldController {

    @Autowired
    private FieldService fs;

    @GetMapping("/praghugetAll")
  //get the value from database
    public List<FieldEntity> getAllFields() {
        return fs.praga();
    }

    @PostMapping("/pragapostAll")
  //posting the value from postman to mysqldatabase 
    public String postField(@RequestBody FieldEntity fe) {
        fs.pragapost(fe);
        return "Posted Successfully";
    }
}