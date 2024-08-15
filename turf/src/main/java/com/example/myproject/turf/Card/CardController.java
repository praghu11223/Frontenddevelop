package com.example.myproject.turf.Card;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
@Autowired

CardService cs;
@GetMapping("/sabsgetAll")
//get the value from database
public List<CardEntity> sabsgetAl1(){
	return cs.sabs();
}
@PostMapping("/sabspostAll")
//posting the value from postman to mysqldatabase 
public String sabsgetAll(CardEntity ce){
	 cs.sabsPost(ce);
	 return "Posted Succesfully";
}
}