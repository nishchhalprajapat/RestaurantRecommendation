package com.sebone.restaurant.data;
import java.util.ArrayList;
/*
*class name: RestaurantDetails
* objective:this class is created for get and set restaurant offer ratting data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class RestaurantDetails {
	OfferData offerData=new OfferData();
	RattingData rattingData=new RattingData();
	RestaurantData restaurantData=new RestaurantData();
	ArrayList<OfferData> offerDataList=new ArrayList<>();
	ArrayList<RattingData> rattingDataList=new ArrayList<>();
	/**
	 * @return the restaurantData
	 */
	public RestaurantData getRestaurantData() {
		return restaurantData;
	}
	/**
	 * @param restaurantData the restaurantData to set
	 */
	public void setRestaurantData(RestaurantData restaurantData) {
		this.restaurantData = restaurantData;
	}
	/**
	 * @return the offerDataList
	 */
	public ArrayList<OfferData> getOfferDataList() {
		return offerDataList;
	}
	/**
	 * @param offerDataList the offerDataList to set
	 */
	public void setOfferDataList(ArrayList<OfferData> offerDataList) {
		this.offerDataList = offerDataList;
	}
	/**
	 * @return the rattingDataList
	 */
	public ArrayList<RattingData> getRattingDataList() {
		return rattingDataList;
	}
	/**
	 * @param rattingDataList the rattingDataList to set
	 */
	public void setRattingDataList(ArrayList<RattingData> rattingDataList) {
		this.rattingDataList = rattingDataList;
	}
}
