package com.example.myproject.turf.Review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevService {
@Autowired

RevRepo Rr;
public List<RevEntity> tharun(){
	return Rr.findAll();
}
public String pragapost(RevEntity e){
	Rr.save(e);
	return "Posted Successfully"
;}
}