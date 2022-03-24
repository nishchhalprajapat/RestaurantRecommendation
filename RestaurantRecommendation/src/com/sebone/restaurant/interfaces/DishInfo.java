package com.sebone.restaurant.interfaces;
import java.util.ArrayList;
import com.sebone.restaurant.data.DishResponse;
import com.sebone.restaurant.data.RestaurantResponse;
/*
*interface name: DishInfo
* objective:this inteface is created for Dish details 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public interface DishInfo {
	DishResponse getDishesByRestaurant(int RestaurantId);
	DishResponse searchDishesByKeyWord(int RestaurantId,String keyword);
	DishResponse searchByDish(String keyword);
	DishResponse filterDish(int RestaurantId, String filterValue);
	DishResponse sortDish(int RestaurantId,String sortValue);
}
