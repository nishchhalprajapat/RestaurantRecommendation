package com.sebone.restaurant.test.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.restaurant.DAO.RestaurantDetailsDAO;
import com.sebone.restaurant.DO.RestaurantDO;

class RestaurantDetailsDAOTest {
	RestaurantDetailsDAO restaurantDetailsDAO=new RestaurantDetailsDAO();
	RestaurantDO restaurantDo=new RestaurantDO();
	@BeforeEach
	void setUp() throws ParseException {
		restaurantDo.setRestaurantId(18);
		restaurantDo.setRestaurantName("my resto");
		restaurantDo.setRestaurantPincode(451221);
		restaurantDo.setRestaurantEmail("n2@g.c");
		restaurantDo.setRestaurantContact(1234546789);
		restaurantDo.setRestaurantType("veg");
		restaurantDo.setRestaurantStatus("open");
		restaurantDo.setRestaurantImage("a.png");
		restaurantDo.setRestaurantDescription("good");
		restaurantDo.setRestaurantOffer("combo");
		restaurantDo.setRestaurantAvgPrice(1234);
		restaurantDo.setRestaurantOpenTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		restaurantDo.setRestaurantCloseTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		restaurantDo.setRestaurantCreateDateTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		restaurantDo.setRestaurantModifiedDateTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
	}

	@Test
	void createRestaurantsTest(){
		assertEquals(true,restaurantDetailsDAO.createRestaurantDetails(restaurantDo));
	}
//	@Test
	void readRestaurantsTest() {
		RestaurantDO result=restaurantDetailsDAO.getRestaurantDetails(restaurantDo.getRestaurantId());
		assertEquals(restaurantDo,result);
		assertEquals("n2@g.c", result.getRestaurantEmail());
	}
	@Test
	void updateRestaurantsTest() {
		restaurantDo.setRestaurantName("Nish Resto");
		assertEquals(true, restaurantDetailsDAO.upadateRestaurantDetails(restaurantDo));
		RestaurantDO result= restaurantDetailsDAO.getRestaurantDetails(restaurantDo.getRestaurantId());
		String restaurantName=result.getRestaurantName();
		assertEquals("Nish Resto", restaurantName);
		
	}
	@Test
	void deleteRestaurantsTest() {
	assertEquals(true, restaurantDetailsDAO.deleteRestaurantDetails(restaurantDo.getRestaurantId()));
	RestaurantDO result= restaurantDetailsDAO.getRestaurantDetails(restaurantDo.getRestaurantId());
	String restaurantName=result.getRestaurantName();
	assertEquals(null, restaurantName);
}


}
