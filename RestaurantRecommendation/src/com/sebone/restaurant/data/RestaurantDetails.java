package com.sebone.restaurant.data;
import java.util.ArrayList;

import com.sebone.restaurant.DO.OfferDO;
import com.sebone.restaurant.DO.RattingDO;
import com.sebone.restaurant.DO.RestaurantDO;
/*
*class name: RestaurantDetails
* objective:this class is created for get and set restaurant offer ratting data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class RestaurantDetails {
	OfferDO offerData=new OfferDO();
	RattingDO rattingData=new RattingDO();
	RestaurantDO restaurantData=new RestaurantDO();
	ArrayList<OfferDO> offerDataList=new ArrayList<>();
	ArrayList<RattingDO> rattingDataList=new ArrayList<>();
	/**
	 * @return the restaurantData
	 */
	public RestaurantDO getRestaurantData() {
		return restaurantData;
	}
	/**
	 * @param restaurantData the restaurantData to set
	 */
	public void setRestaurantData(RestaurantDO restaurantData) {
		this.restaurantData = restaurantData;
	}
	/**
	 * @return the offerDataList
	 */
	public ArrayList<OfferDO> getOfferDataList() {
		return offerDataList;
	}
	/**
	 * @param offerDataList the offerDataList to set
	 */
	public void setOfferDataList(ArrayList<OfferDO> offerDataList) {
		this.offerDataList = offerDataList;
	}
	/**
	 * @return the rattingDataList
	 */
	public ArrayList<RattingDO> getRattingDataList() {
		return rattingDataList;
	}
	/**
	 * @param rattingDataList the rattingDataList to set
	 */
	public void setRattingDataList(ArrayList<RattingDO> rattingDataList) {
		this.rattingDataList = rattingDataList;
	}
}
