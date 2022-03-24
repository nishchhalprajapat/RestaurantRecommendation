package com.sebone.restaurant.interfacesImpl;
import com.sebone.restaurant.data.DishResponse;
import com.sebone.restaurant.interfaces.DishInfo;
/*
*class name: DishInfoImpl
* objective:this class is created for implement DishInfo interface
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class DishInfoImpl implements DishInfo {
	/*
	* function name: getDishesByRestaurant
	* objective: this function is created for get dishes by particular restaurant 
	* @params: int restaurantId
	* @return: DishResponse
	*/
	@Override
	public DishResponse getDishesByRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	* function name: searchDishesByKeyWord
	* objective: this function is created for get dishes by keyword for particular restaurant 
	* @params: int restaurantId , String keyword
	* @return: DishResponse
	*/
	@Override
	public DishResponse searchDishesByKeyWord(int RestaurantId, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	* function name: searchByDish
	* objective: this function is created for get dishes by keyword for all restaurant 
	* @params: String keyword
	* @return: DishResponse
	*/
	@Override
	public DishResponse searchByDish(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	* function name: filterDish
	* objective: this function is created for get filter dishes by different different filter value  
	* @params: int restaurantId , String filterValue
	* @return: DishResponse
	*/
	@Override
	public DishResponse filterDish(int RestaurantId, String filterValue) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	* function name: sortDish
	* objective: this function is created for get sorted dishes by different different sort value  
	* @params: int restaurantId , String sortValue
	* @return: DishResponse
	*/
	@Override
	public DishResponse sortDish(int RestaurantId, String sortValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
