package com.example.myproject.turf.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RevRepo extends JpaRepository<RevEntity,Integer>{

}