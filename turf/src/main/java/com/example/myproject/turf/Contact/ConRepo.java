package com.example.myproject.turf.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConRepo extends JpaRepository<ConEntity,Integer>{

}