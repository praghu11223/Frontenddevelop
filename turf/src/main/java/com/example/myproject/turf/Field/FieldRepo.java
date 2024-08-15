package com.example.myproject.turf.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FieldRepo extends JpaRepository<FieldEntity,Integer>{

}