package com.SpringRest.practiceRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.practiceRest.Entities.Movie;

public interface MovieServicedao  extends JpaRepository<Movie,Integer>{

}
 