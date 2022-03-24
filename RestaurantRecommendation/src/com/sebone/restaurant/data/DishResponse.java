package com.sebone.restaurant.data;
import java.util.ArrayList;

/*
*class name: DishResponse
* objective:this class is created for get and set response data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class DishResponse {
	DishDetails dishDetails=new DishDetails();
	ArrayList<DishDetails> dishDetailsList=new ArrayList<>();
	private boolean isSuccess;
	private String message;
	/**
	 * @return the dishDetailsList
	 */
	public ArrayList<DishDetails> getDishDetailsList() {
		return dishDetailsList;
	}
	/**
	 * @param dishDetailsList the dishDetailsList to set
	 */
	public void setDishDetailsList(ArrayList<DishDetails> dishDetailsList) {
		this.dishDetailsList = dishDetailsList;
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
