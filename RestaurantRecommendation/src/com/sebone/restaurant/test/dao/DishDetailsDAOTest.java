/**
 * 
 */
package com.sebone.restaurant.test.dao;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import com.sebone.restaurant.DAO.DishDetailsDAO;
import com.sebone.restaurant.DO.DishDO;

/**
 * @author Nishchhal Prajapat
 *
 */

@TestMethodOrder(OrderAnnotation.class)
class DishDetailsDAOTest {
	DishDetailsDAO dishDetails=new DishDetailsDAO();
	DishDO dishDO= new DishDO();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		dishDO.setDishId(14);
		dishDO.setDishName("Panneer");
		dishDO.setDishPrice(50);
		dishDO.setDishImage("panner.png");
		dishDO.setDishDescription("good quality");
		dishDO.setDishType("veg");
		dishDO.setDishStatus("available");
		dishDO.setDishTime("all time");
		dishDO.setRestaurants_id(1);
		dishDO.setDishCreateAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		dishDO.setDishModifiedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		dishDO.setDishPreparationTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void createDishDetailsTest() {
		boolean result=dishDetails.createDishDetails(dishDO);
		assertEquals(true, result);
	}
//	@Test
	@Order(2)
	void readDishDetailsTest() {
		DishDO result=dishDetails.getDishDetails(dishDO.getDishId());
		assertEquals("Panneer", result.getDishName());
	}
	@Test
	@Order(3)
	void upadateDishDetailsTest() {
		dishDO.setDishPrice(22);
		assertEquals(true, dishDetails.upadateDishDetails(dishDO,14));
		assertEquals(22, dishDetails.getDishDetails(dishDO.getDishId()).getDishPrice());
	}
	@Test
	@Order(4)
	void deleteDishDetailsTest() {
	assertEquals(true, dishDetails.deleteDishDetails(dishDO.getDishId()));
	String dishName=dishDetails.getDishDetails(dishDO.getDishId()).getDishName();
	assertEquals(null, dishName);
	}
}
