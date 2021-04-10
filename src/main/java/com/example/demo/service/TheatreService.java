package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.ScreenRepo;
import com.example.demo.dao.SeatRepo;
import com.example.demo.dao.TheatreRepo;
import com.example.demo.modal.City;
import com.example.demo.modal.Screen;
import com.example.demo.modal.Seat;
import com.example.demo.modal.Theatre;

@Service
public class TheatreService {
	
	@Autowired
	TheatreRepo theatreRepo;
	
	@Autowired
	ScreenRepo screenRepo;
	
	@Autowired
	SeatRepo seatRepo;

	public List<Theatre> fetchByZipcode(Integer zipcode)
	{
                

                  System.out.println("Hello");

		return theatreRepo.oncat(zipcode);		
	}
	
	
	
	public void AddTheatreRepo( )
	{	
		
        String theatrename = "SagarTheatre";
		Integer zipcode = 110096; //check that its available in city table;
		Integer totalscreens = 2;
		int[] totalSeatsArray = new int[]{ 40,30}; 
		

		System.out.println(totalSeatsArray);
		City c= new City(zipcode);
		
		Theatre th = new Theatre();
		th.setTheatreName(theatrename);
		th.setTotalScreens(totalscreens);
		th.setCity(c);
		
		//--------------------

	//Theater :
		//theatreRepo.save(th);
		
	//Screens :
		Theatre theatre = theatreRepo.findByTheatreName(theatrename);
		System.out.println("Added theatre name "+theatre.getTheatreName());
		for (int i = 1; i <= totalscreens; i++) 
		{
			Integer totalNoOfSeats = totalSeatsArray[i-1]; 
			String s="Screen"+i;
			Screen screen = new Screen();
			screen.setTotalNoOfSeats(totalNoOfSeats);
			screen.setScreenName(s);
			screen.setTheatre(theatre);
			//screenRepo.save(screen);	
		
		//Seats :
//			Integer theatreid=screen.getTheatre().getTheatreid();
//			String screenName= screen.getScreenName();
//			//System.out.println(theatreid+" "+screenName);
//			Screen scr = screenRepo.findByTheatreIdAndScreenId(theatreid,screenName);
//
//			System.out.println(scr);
//			
//			System.out.println(screen.getTheatre().getTheatreid());
//			System.out.println(screen.getScreenName());
//			System.out.println(scr);
//			for (int j = 1; j <= totalNoOfSeats; j++) 
//			{				
//				Seat seat = new Seat();
//				seat.setScreen(screen);
//				seat.setSeatNumber(j);
//				
//				seat.setScreen(screen);
//				//seat.setMovieShow(movieShow);
//				System.out.println(seat);
				//seatRepo.save(seat);
//			}	
		}
	}
}
