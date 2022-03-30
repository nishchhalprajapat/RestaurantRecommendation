package com.sebone.restaurant.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sebone.restaurant.DO.OfferDO;
import com.sebone.restaurant.config.DbConfig;

public class RestaurantOfferDAO {
	public OfferDO getRestaurantOffer(int id){
		OfferDO offerDO=new OfferDO();
		try {
			Connection con=DbConfig.create();
			PreparedStatement preparedStatement=con.prepareStatement("select * from restaurant_offer where Offer_id = ?");
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				offerDO.setOfferId(rs.getInt("Offer_id"));
				offerDO.setOfferType(rs.getString("Offer_type"));
				offerDO.setOfferDiscount(rs.getString("Offer_discount"));
				offerDO.setOfferStartDateTime(rs.getDate("Offer_Start_Date_Time"));
				offerDO.setOfferEndDateTime(rs.getDate("Offer_End_Date_Time"));
				offerDO.setOfferCreatedAt(rs.getDate("Offer_created_at"));
				offerDO.setOfferModifiedAt(rs.getDate("Offer_Modified_at"));
				offerDO.setRestaurantId(rs.getInt("Restaurent_id"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	return offerDO;	
	}
	public boolean createOfferDetails(OfferDO offerData) {
		boolean isSuccess=false;
		try {
			Connection con=DbConfig.create();
//			
			String query="insert into restaurant_offer(Offer_id,Offer_type,Offer_discount,Offer_Start_Date_Time,Offer_End_Date_Time,Offer_created_at,offer_Modified_at,Restaurent_id) values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1, offerData.getOfferId());
			preparedStatement.setString(2,offerData.getOfferType());
			preparedStatement.setString(3, offerData.getOfferDiscount());
			preparedStatement.setDate(4,new java.sql.Date(offerData.getOfferStartDateTime().getTime()));
			preparedStatement.setDate(5, new java.sql.Date(offerData.getOfferEndDateTime().getTime()));
			preparedStatement.setDate(6, new java.sql.Date(offerData.getOfferCreatedAt().getTime()));
			preparedStatement.setDate(7,new java.sql.Date(offerData.getOfferModifiedAt().getTime()));
			preparedStatement.setInt(8, offerData.getRestaurantId());
			int result=preparedStatement.executeUpdate();
			if(result!=0) {
			isSuccess=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public boolean deleteOfferDetails(int id) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="delete from restaurant_offer where Offer_id=?";
				PreparedStatement prepareStatement=con.prepareStatement(query);
				prepareStatement.setInt(1, id);
				int result=prepareStatement.executeUpdate();
				if(result!=0) {
				isSuccess=true;
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public boolean upadateRestaurantDetails(OfferDO offerData) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="update restaurant_offer Set Offer_type=?,Offer_discount=?,Offer_Start_Date_Time=?,Offer_End_Date_Time=?,Offer_created_at=?,offer_Modified_at=?,Restaurent_id=?  where Offer_id=?";
				PreparedStatement preparedStatement=con.prepareStatement(query);
				preparedStatement.setString(1,offerData.getOfferType());
				preparedStatement.setString(2, offerData.getOfferDiscount());
				preparedStatement.setDate(3,new java.sql.Date(offerData.getOfferStartDateTime().getTime()));
				preparedStatement.setDate(4, new java.sql.Date(offerData.getOfferEndDateTime().getTime()));
				preparedStatement.setDate(5, new java.sql.Date(offerData.getOfferCreatedAt().getTime()));
				preparedStatement.setDate(6,new java.sql.Date(offerData.getOfferModifiedAt().getTime()));
				preparedStatement.setInt(7, offerData.getRestaurantId());	
				preparedStatement.setInt(8,offerData.getOfferId());
				int result=preparedStatement.executeUpdate();
				if(result!=0) {
				isSuccess=true;
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

}
