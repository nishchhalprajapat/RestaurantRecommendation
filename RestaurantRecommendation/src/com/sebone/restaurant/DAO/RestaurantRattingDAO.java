package com.sebone.restaurant.DAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.restaurant.DO.OfferDO;
import com.sebone.restaurant.DO.RattingDO;
import com.sebone.restaurant.DO.RestaurantDO;
import com.sebone.restaurant.config.DbConfig;

public class RestaurantRattingDAO {
	RattingDO ratting =new RattingDO();
	public RattingDO getRestaurantRating(int id){
		RattingDO rattingDO=new RattingDO();
		try {
			Connection con=DbConfig.create();
			PreparedStatement preparedStatement=con.prepareStatement("select * from restaurant_rating where Rating_id = ?");
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				rattingDO.setRattingId(rs.getInt("Rating_id"));
				rattingDO.setRattingStar(rs.getInt("Rating_stars"));
				rattingDO.setRattingDescription(rs.getString("Rating_description"));
				rattingDO.setRattingTime(rs.getDate("Rating_time"));
				rattingDO.setRattingUser(rs.getString("Rating_user"));
				rattingDO.setRestaurantId(rs.getInt("restaurants_id"));
				rattingDO.setRatingCreatedAt(rs.getDate("Rating_created_at"));
				rattingDO.setRatingModifiedAt(rs.getDate("Rating_modified_at"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	return rattingDO;	
	}
	public boolean createRattingDetails(RattingDO ratingData) {
		boolean isSuccess=false;
		try {
			Connection con=DbConfig.create();
//			
			String query="insert into restaurant_rating(Rating_id,Rating_stars,Rating_description,Rating_time,Rating_user,restaurants_id,Rating_created_at,Rating_modified_at) values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1, ratingData.getRattingId());
			preparedStatement.setInt(2, ratingData.getRattingStar());
			preparedStatement.setString(3, ratingData.getRattingDescription());
			preparedStatement.setDate(4, new java.sql.Date(ratingData.getRattingTime().getTime()));
			preparedStatement.setString(5, ratingData.getRattingUser());
			preparedStatement.setInt(6, ratingData.getRestaurantId());
			preparedStatement.setDate(7, new java.sql.Date(ratingData.getRatingCreatedAt().getTime()));
			preparedStatement.setDate(8, new java.sql.Date(ratingData.getRatingModifiedAt().getTime()));
			int result=preparedStatement.executeUpdate();
			if(result!=0) {
			isSuccess=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public boolean deleteRatingDetails(int id) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="delete from restaurant_rating where Rating_id=?";
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
	public boolean upadateRestaurantRatingDetails(RattingDO ratingData) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="update restaurant_rating Set Rating_stars=?,Rating_description=?,Rating_time=?,Rating_user=?,restaurants_id=?,Rating_created_at=?,Rating_modified_at=?  where Rating_id=?";
				PreparedStatement preparedStatement=con.prepareStatement(query);
				preparedStatement.setInt(1, ratingData.getRattingStar());
				preparedStatement.setString(2, ratingData.getRattingDescription());
				preparedStatement.setDate(3, new java.sql.Date(ratingData.getRattingTime().getTime()));
				preparedStatement.setString(4, ratingData.getRattingUser());
				preparedStatement.setInt(5, ratingData.getRestaurantId());
				preparedStatement.setDate(6, new java.sql.Date(ratingData.getRatingCreatedAt().getTime()));
				preparedStatement.setDate(7, new java.sql.Date(ratingData.getRatingModifiedAt().getTime()));
				preparedStatement.setInt(8, ratingData.getRattingId());
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
