package com.sebone.restaurant.data;

/*
*class name: DishDetails
* objective:this class is created for get and set dish data and restaurant details data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class DishDetails {
	DishData dishData=new DishData();
	RestaurantDetails restaurantDetails=new RestaurantDetails();
	/**
	 * @return the dishData
	 */
	public DishData getDishData() {
		return dishData;
	}
	/**
	 * @param dishData the dishData to set
	 */
	public void setDishData(DishData dishData) {
		this.dishData = dishData;
	}
	/**
	 * @return the restaurantDetails
	 */
	public RestaurantDetails getRestaurantDetails() {
		return restaurantDetails;
	}
	/**
	 * @param restaurantDetails the restaurantDetails to set
	 */
	public void setRestaurantDetails(RestaurantDetails restaurantDetails) {
		this.restaurantDetails = restaurantDetails;
	}	
}
