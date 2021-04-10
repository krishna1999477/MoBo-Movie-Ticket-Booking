package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Screen;

public interface ScreenRepo extends JpaRepository<Screen, Integer> 
{

	
//	@Query("from screen where theatreid = :x and screenname=:y")
//	public Screen findByTheatreIdAndScreenId(@Param("x")Integer theatreid, @Param("y")String screenName);

	
	
	

	
	
}
