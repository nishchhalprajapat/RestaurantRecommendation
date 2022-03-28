package com.sebone.restaurant.data;

import com.sebone.restaurant.DO.DishDO;

/*
*class name: DishDetails
* objective:this class is created for get and set dish data and restaurant details data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class DishDetails {
	DishDO dishData=new DishDO();
	RestaurantDetails restaurantDetails=new RestaurantDetails();
	/**
	 * @return the dishData
	 */
	public DishDO getDishData() {
		return dishData;
	}
	/**
	 * @param dishData the dishData to set
	 */
	public void setDishData(DishDO dishData) {
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
