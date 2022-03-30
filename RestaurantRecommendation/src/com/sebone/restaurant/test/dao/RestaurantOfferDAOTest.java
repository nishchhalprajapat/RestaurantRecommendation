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
import com.sebone.restaurant.DAO.RestaurantOfferDAO;
import com.sebone.restaurant.DO.OfferDO;

@TestMethodOrder(OrderAnnotation.class)
class RestaurantOfferDAOTest {
	RestaurantOfferDAO restaurantOfferDAO=new RestaurantOfferDAO();
	OfferDO offerData=new OfferDO();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		offerData.setOfferId(3);
		offerData.setOfferType("combo");
		offerData.setOfferDiscount("2%");
		offerData.setOfferStartDateTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		offerData.setOfferEndDateTime(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		offerData.setOfferCreatedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		offerData.setOfferModifiedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		offerData.setRestaurantId(2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void createOfferDetails() {
		boolean result=restaurantOfferDAO.createOfferDetails(offerData);
		assertEquals(true, result);
	}
	@Test
	@Order(2)
	void readOfferDetails() {
		OfferDO result=restaurantOfferDAO.getRestaurantOffer(offerData.getOfferId());
		String offerType= restaurantOfferDAO.getRestaurantOffer(offerData.getOfferId()).getOfferType();
//		assertEquals(offerData, result);
		assertEquals("combo", offerType);
	}
	@Test
	@Order(3)
	void updateOfferDetails() {
		offerData.setOfferDiscount("5%");
		boolean result=restaurantOfferDAO.upadateRestaurantDetails(offerData);
		assertEquals(true, result);
		String offerDiscount=restaurantOfferDAO.getRestaurantOffer(offerData.getOfferId()).getOfferDiscount();
		assertEquals("5%",offerDiscount);
	}
	@Test 
	@Order(4)
	void deleteOfferDetails() {
		boolean result=restaurantOfferDAO.deleteOfferDetails(offerData.getOfferId());
		assertEquals(true, result);
		OfferDO resultData= restaurantOfferDAO.getRestaurantOffer(offerData.getOfferId());
		assertEquals(null, resultData.getOfferDescription());
	}

}
