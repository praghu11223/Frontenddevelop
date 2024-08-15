package com.example.myproject.turf.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CardRepo extends JpaRepository<CardEntity,Integer> {

}