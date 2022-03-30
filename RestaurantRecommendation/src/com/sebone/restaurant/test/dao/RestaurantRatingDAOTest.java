package com.sebone.restaurant.test.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.sebone.restaurant.DAO.RestaurantRattingDAO;
import com.sebone.restaurant.DO.RattingDO;

@TestMethodOrder(OrderAnnotation.class)
class RestaurantRatingDAOTest {
	RestaurantRattingDAO restaurantRattingDAO=new RestaurantRattingDAO();
	RattingDO rattingDO=new RattingDO();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		rattingDO.setRattingId(13);
		rattingDO.setRattingStar(5);
		rattingDO.setRattingDescription("good quality");
		rattingDO.setRattingTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		rattingDO.setRattingUser("Nish");
		rattingDO.setRestaurantId(2);
		rattingDO.setRatingCreatedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		rattingDO.setRatingModifiedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	@Order(1)
	void createRatingDetails() {
		assertEquals(true,restaurantRattingDAO.createRattingDetails(rattingDO));
	}
	@Test
	@Order(2)
	void readRattingDetails() {
		RattingDO result=restaurantRattingDAO.getRestaurantRating(rattingDO.getRattingId());
		int star= restaurantRattingDAO.getRestaurantRating(rattingDO.getRattingId()).getRattingStar();
		assertEquals(5, star);
	}
	@Test
	@Order(3)
	void updateRattingDetails() {
		rattingDO.setRestaurantId(5);;
		boolean result=restaurantRattingDAO.upadateRestaurantRatingDetails(rattingDO);
		assertEquals(true, result);
		int restaurantId=restaurantRattingDAO.getRestaurantRating(rattingDO.getRattingId()).getRestaurantId();
		assertEquals(5,restaurantId);
	}
	@Test
	@Order(4) 
	void deleteOfferDetails() {
		boolean result=restaurantRattingDAO.deleteRatingDetails(rattingDO.getRattingId());
		assertEquals(true, result);
		RattingDO resultData= restaurantRattingDAO.getRestaurantRating(rattingDO.getRattingId());
		assertEquals(null, resultData.getRattingUser());
	}
	}

