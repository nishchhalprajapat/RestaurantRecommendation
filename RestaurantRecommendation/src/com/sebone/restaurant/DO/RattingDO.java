package com.sebone.restaurant.DO;
import java.util.Date;

/*
*class name: RattingData
* objective:this class is created for get and set Ratting data 
* author:Nishchhal Prajapati 
* Date 24/03/2022
*/
public class RattingDO {
	private int rattingId;
	private int rattingStar;
	private String rattingDescription;
	private Date rattingTime;
	private String rattingUser;
	private int restaurantId;
	private Date ratingCreatedAt;
	private Date ratingModifiedAt;
	/**
	 * @return the restaurantId
	 */
	public int getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	/**
	 * @return the ratingCreatedAt
	 */
	public Date getRatingCreatedAt() {
		return ratingCreatedAt;
	}
	/**
	 * @param ratingCreatedAt the ratingCreatedAt to set
	 */
	public void setRatingCreatedAt(Date ratingCreatedAt) {
		this.ratingCreatedAt = ratingCreatedAt;
	}
	/**
	 * @return the ratingModifiedAt
	 */
	public Date getRatingModifiedAt() {
		return ratingModifiedAt;
	}
	/**
	 * @param ratingModifiedAt the ratingModifiedAt to set
	 */
	public void setRatingModifiedAt(Date ratingModifiedAt) {
		this.ratingModifiedAt = ratingModifiedAt;
	}
	/**
	 * @return the rattingId
	 */
	public int getRattingId() {
		return rattingId;
	}
	/**
	 * @param rattingId the rattingId to set
	 */
	public void setRattingId(int rattingId) {
		this.rattingId = rattingId;
	}
	/**
	 * @return the rattingStar
	 */
	public int getRattingStar() {
		return rattingStar;
	}
	/**
	 * @param rattingStar the rattingStar to set
	 */
	public void setRattingStar(int rattingStar) {
		this.rattingStar = rattingStar;
	}
	/**
	 * @return the rattingDescription
	 */
	public String getRattingDescription() {
		return rattingDescription;
	}
	/**
	 * @param rattingDescription the rattingDescription to set
	 */
	public void setRattingDescription(String rattingDescription) {
		this.rattingDescription = rattingDescription;
	}
	/**
	 * @return the rattingTime
	 */
	public Date getRattingTime() {
		return rattingTime;
	}
	/**
	 * @param rattingTime the rattingTime to set
	 */
	public void setRattingTime(Date rattingTime) {
		this.rattingTime = rattingTime;
	}
	/**
	 * @return the rattingUser
	 */
	public String getRattingUser() {
		return rattingUser;
	}
	/**
	 * @param rattingUser the rattingUser to set
	 */
	public void setRattingUser(String rattingUser) {
		this.rattingUser = rattingUser;
	}
}
