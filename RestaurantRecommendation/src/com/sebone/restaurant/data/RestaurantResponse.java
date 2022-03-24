package com.sebone.restaurant.data;

import java.util.ArrayList;

/*
*class name: RestaurantResponse
* objective:this class is created for get and set response data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class RestaurantResponse {
	RestaurantDetails restaurantDetails=new RestaurantDetails();
	ArrayList<RestaurantDetails>restaurantDetailsList=new ArrayList<>();
	private boolean isSuccess;
	private String message;
	/**
	 * @return the restaurantDetailsList
	 */
	public ArrayList<RestaurantDetails> getRestaurantDetailsList() {
		return restaurantDetailsList;
	}
	/**
	 * @param restaurantDetailsList the restaurantDetailsList to set
	 */
	public void setRestaurantDetailsList(ArrayList<RestaurantDetails> restaurantDetailsList) {
		this.restaurantDetailsList = restaurantDetailsList;
	}
	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
