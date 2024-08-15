package com.example.myproject.turf.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthRepo extends JpaRepository<AuthEntity,Integer> {

}