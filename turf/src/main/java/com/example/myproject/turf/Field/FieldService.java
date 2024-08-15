package com.example.myproject.turf.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldService {
@Autowired

FieldRepo fr;
public List<FieldEntity> praga(){
	return fr.findAll();
}
public String pragapost(FieldEntity e){
	fr.save(e);
	return "Posted Successfully"
;}
}