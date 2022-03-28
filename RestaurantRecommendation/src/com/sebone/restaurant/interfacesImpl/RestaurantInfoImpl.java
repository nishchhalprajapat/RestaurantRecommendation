package com.sebone.restaurant.interfacesImpl;
import java.util.ArrayList;

import com.sebone.restaurant.DO.RestaurantResponse;
import com.sebone.restaurant.interfaces.RestaurantInfo;
/*
*class name: RestaurantInfoImpl
* objective:this class is created for implement RestaurantInfo interface
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class RestaurantInfoImpl implements RestaurantInfo {
	/*
	* function name: getRestaurantDetails
	* objective: this function is created for get Restaurant details through pincode 
	* @params: int pincode
	* @return: RestaurantResponse
	*/
	@Override
	public RestaurantResponse getRestaurantDetails(int pincode) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	* function name: getRestaurantByName
	* objective: this function is created for get Restaurant details through Name for particular pincode 
	* @params: int pincode, String name
	* @return: RestaurantResponse
	*/
	@Override
	public RestaurantResponse getRestaurantByName(int pincode, String name) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	* function name: filterRestaurantDetails
	* objective: this function is created for get filter Restaurant details through particular filter value 
	* @params: int pincode, ArrayList<String> filterValue
	* @return: RestaurantResponse
	*/
	@Override
	public RestaurantResponse filterRestaurantDetails(int pincode, ArrayList<String> filterValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
	* function name: sortRestaurantDetails
	* objective: this function is created for get sorted Restaurant details through particular sort value 
	* @params: int pincode, ArrayList<String> sortValue
	* @return: RestaurantResponse
	*/
	public RestaurantResponse sortRestaurantDetails(int pincode, ArrayList<String> sortValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
