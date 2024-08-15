package com.example.myproject.turf.Card;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
@Autowired

CardRepo ob;
public List<CardEntity> sabs(){
	return ob.findAll();
}
public String sabsPost(CardEntity e){
	ob.save(e);
	return "Posted Successfully"
;}
}