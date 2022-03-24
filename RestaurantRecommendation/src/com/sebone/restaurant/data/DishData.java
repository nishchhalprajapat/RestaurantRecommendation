package com.sebone.restaurant.data;

import java.util.Date;

/*
*class name: DishData
* objective:this class is created for get and set DishData data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class DishData {
	int dishId;
	String dishName;
	int dishPrice;
	String dishImage;
	String dishDescription;
	String dishType;
	String dishStatus;
	Date dishTime;
	Date dishPreparationTime;
	
	/**
	 * @return the dishId
	 */
	public int getDishId() {
		return dishId;
	}
	/**
	 * @param dishId the dishId to set
	 */
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}
	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	/**
	 * @return the dishPrice
	 */
	public int getDishPrice() {
		return dishPrice;
	}
	/**
	 * @param dishPrice the dishPrice to set
	 */
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	/**
	 * @return the dishImage
	 */
	public String getDishImage() {
		return dishImage;
	}
	/**
	 * @param dishImage the dishImage to set
	 */
	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}
	/**
	 * @return the dishDescription
	 */
	public String getDishDescription() {
		return dishDescription;
	}
	/**
	 * @param dishDescription the dishDescription to set
	 */
	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	/**
	 * @return the dishType
	 */
	public String getDishType() {
		return dishType;
	}
	/**
	 * @param dishType the dishType to set
	 */
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	/**
	 * @return the dishStatus
	 */
	public String getDishStatus() {
		return dishStatus;
	}
	/**
	 * @param dishStatus the dishStatus to set
	 */
	public void setDishStatus(String dishStatus) {
		this.dishStatus = dishStatus;
	}
	/**
	 * @return the dishTime
	 */
	public Date getDishTime() {
		return dishTime;
	}
	/**
	 * @param dishTime the dishTime to set
	 */
	public void setDishTime(Date dishTime) {
		this.dishTime = dishTime;
	}
	/**
	 * @return the dishPreparationTime
	 */
	public Date getDishPreparationTime() {
		return dishPreparationTime;
	}
	/**
	 * @param dishPreparationTime the dishPreparationTime to set
	 */
	public void setDishPreparationTime(Date dishPreparationTime) {
		this.dishPreparationTime = dishPreparationTime;
	}
}
