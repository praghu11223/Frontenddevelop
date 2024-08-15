package com.example.myproject.turf.Auth;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthController {
@Autowired
 AuthService se;
 @GetMapping("/pragagetAll")
 //get the value from database
public List<AuthEntity> pragagetAll(){
	return se.shashAll();
}
 @PostMapping("/shashPost")
 public String shashgetAll(@RequestBody AuthEntity e){
	se.shashPost(e);
	 return "Posted Succesfully";
 }
}