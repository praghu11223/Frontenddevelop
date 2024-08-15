package com.example.myproject.turf.Contact;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConService {
@Autowired

ConRepo cr;
public List<ConEntity> suri(){
	return cr.findAll();
}
public String suriPost(ConEntity e){
	cr.save(e);
	return "Posted Successfully"
;}
}