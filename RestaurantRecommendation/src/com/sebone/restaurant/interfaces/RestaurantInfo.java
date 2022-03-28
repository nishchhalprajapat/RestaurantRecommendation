package com.sebone.restaurant.interfaces;

import java.util.ArrayList;

import com.sebone.restaurant.DO.RestaurantResponse;
/*
*interface name: RestaurantInfo
* objective:this inteface is created for Restaurant details 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public interface RestaurantInfo {
	RestaurantResponse getRestaurantDetails(int pinCode);
	RestaurantResponse getRestaurantByName(int pinCode,String name);
	RestaurantResponse filterRestaurantDetails(int pinCode,ArrayList<String>filterValue);
	RestaurantResponse sortRestaurantDetails(int pinCode,ArrayList<String>sortValue);
}
