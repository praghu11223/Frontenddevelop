package com.example.myproject.turf.Auth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
@Autowired
 
AuthRepo re;
public List<AuthEntity> shashAll(){
	return re.findAll();
}
public String shashPost(AuthEntity e){
			re.save(e);
			return "Posted Successfully"
;}
}