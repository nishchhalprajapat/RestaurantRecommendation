package com.sebone.restaurant.DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import com.sebone.restaurant.DO.RestaurantDO;
import com.sebone.restaurant.config.DbConfig;
public class RestaurantDetailsDAO {
	public RestaurantDO getRestaurantDetails(int id){
		RestaurantDO restaurantData=new RestaurantDO();
		try {
			Connection con=DbConfig.create();
			PreparedStatement preparedStatement=con.prepareStatement("select * from restaurants_details where restaurants_id= ?");
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				restaurantData.setRestaurantId(rs.getInt("restaurants_id"));
				restaurantData.setRestaurantName(rs.getString("restaurants_name"));
				restaurantData.setRestaurantEmail(rs.getString("restaurants_email"));
				restaurantData.setRestaurantContact(rs.getLong("restaurants_contact"));
				restaurantData.setRestaurantType(rs.getString("restaurants_type"));
				restaurantData.setRestaurantStatus(rs.getString("restaurants_status"));
				restaurantData.setRestaurantDescription(rs.getString("restaurants_description"));
				restaurantData.setRestaurantAvgPrice(rs.getInt("restaurants_avg_price"));
				restaurantData.setRestaurantImage(rs.getString("restaurants_image"));
				restaurantData.setRestaurantPincode(rs.getInt("restaurants_pincode"));
				restaurantData.setRestaurantOffer(rs.getString("restaurants_offers"));
				restaurantData.setRestaurantOpenTime(rs.getDate("restaurants_open"));
				restaurantData.setRestaurantCloseTime(rs.getDate("restaurants_close"));
				restaurantData.setRestaurantCreateDateTime(rs.getDate("restaurants_created_at"));
				restaurantData.setRestaurantModifiedDateTime(rs.getDate("restaurants_modified_at"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	return restaurantData;	
	}
	public boolean createRestaurantDetails(RestaurantDO restaurantDetails) {
		boolean isSuccess=false;
		try {
			Connection con=DbConfig.create();
//			
			String query="insert into restaurants_details(restaurants_id,restaurants_name,restaurants_email,restaurants_contact,restaurants_type,restaurants_status,restaurants_description,restaurants_avg_price,restaurants_image,restaurants_pincode,restaurants_offers,restaurants_open,restaurants_close,restaurants_created_at,restaurants_modified_at) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1, restaurantDetails.getRestaurantId());
			preparedStatement.setString(2,restaurantDetails.getRestaurantName());
			preparedStatement.setString(3, restaurantDetails.getRestaurantEmail());
			preparedStatement.setLong(4, restaurantDetails.getRestaurantContact());
			preparedStatement.setString(5, restaurantDetails.getRestaurantType());
			preparedStatement.setString(6, restaurantDetails.getRestaurantStatus());
			preparedStatement.setString(7,restaurantDetails.getRestaurantDescription());
			preparedStatement.setInt(8, restaurantDetails.getRestaurantAvgPrice());
			preparedStatement.setString(9, restaurantDetails.getRestaurantImage());
			preparedStatement.setInt(10, restaurantDetails.getRestaurantPincode());
			preparedStatement.setString(11,restaurantDetails.getRestaurantOffer());
			preparedStatement.setDate(12,  new java.sql.Date(restaurantDetails.getRestaurantOpenTime().getTime()));
			preparedStatement.setDate(13,  new java.sql.Date( restaurantDetails.getRestaurantCloseTime().getTime()));
			preparedStatement.setDate(14,  new java.sql.Date(restaurantDetails.getRestaurantCreateDateTime().getTime()));
			preparedStatement.setDate(15,  new java.sql.Date (restaurantDetails.getRestaurantModifiedDateTime().getTime()));
			preparedStatement.executeUpdate();
			isSuccess=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public boolean deleteRestaurantDetails(int id) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="delete from restaurants_details where restaurants_id=?";
				PreparedStatement prepareStatement=con.prepareStatement(query);
				prepareStatement.setInt(1, id);
				prepareStatement.executeUpdate();
				isSuccess=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
//	public boolean upadateRestaurantDetails(String name,int id) {
//		boolean isSuccess=false;
//		try {
//				Connection con=DbConfig.create();
//				String query="update restaurants_details Set restaurants_name=? where restaurants_id=?";
//				PreparedStatement prepareStatement=con.prepareStatement(query);
//				prepareStatement.setString(1, name);
//				prepareStatement.setInt(2, id);
//				prepareStatement.executeUpdate();
//				isSuccess=true;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return isSuccess;
//	} 
//	
	public boolean upadateRestaurantDetails(RestaurantDO restaurantDO) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="update restaurants_details Set restaurants_name=?,restaurants_pincode=?, restaurants_email=?, restaurants_contact=?,restaurants_type=?,restaurants_status=?,restaurants_image=?,restaurants_description=?,restaurants_offers=?,restaurants_avg_price=?,restaurants_open=?,restaurants_close=?,restaurants_created_at=?,restaurants_modified_at=?  where restaurants_id=?";
				PreparedStatement prepareStatement=con.prepareStatement(query);
				prepareStatement.setString(1, restaurantDO.getRestaurantName());
				prepareStatement.setInt(2, restaurantDO.getRestaurantPincode());
				prepareStatement.setString(3, restaurantDO.getRestaurantEmail());
				prepareStatement.setLong(4, restaurantDO.getRestaurantContact());
				prepareStatement.setString(5, restaurantDO.getRestaurantType());
				prepareStatement.setString(6, restaurantDO.getRestaurantStatus());
				prepareStatement.setString(7, restaurantDO.getRestaurantImage());
				prepareStatement.setString(8,restaurantDO.getRestaurantDescription());
				prepareStatement.setString(9, restaurantDO.getRestaurantOffer());
				prepareStatement.setInt(10, restaurantDO.getRestaurantAvgPrice());
				prepareStatement.setDate(11, new java.sql.Date(restaurantDO.getRestaurantOpenTime().getTime()));
				prepareStatement.setDate(12, new java.sql.Date(restaurantDO.getRestaurantCloseTime().getTime()));
				prepareStatement.setDate(13, new java.sql.Date(restaurantDO.getRestaurantCreateDateTime().getTime()));
				prepareStatement.setDate(14, new java.sql.Date(restaurantDO.getRestaurantModifiedDateTime().getTime()));
				prepareStatement.setInt(15, restaurantDO.getRestaurantId());
				int result=prepareStatement.executeUpdate();
				if(result!=0) {
				isSuccess=true;
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
}
