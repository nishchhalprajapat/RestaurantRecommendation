package com.sebone.restaurant.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.sebone.restaurant.DO.DishDO;
import com.sebone.restaurant.DO.RestaurantDO;
import com.sebone.restaurant.config.DbConfig;
public class DishDetailsDAO {
	public DishDO getDishDetails(int id){
		DishDO dishData=new DishDO();
		try {
			Connection con=DbConfig.create();
			PreparedStatement preparedStatement=con.prepareStatement("select * from dish_details where Dish_id=?");
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				dishData.setDishId(rs.getInt("Dish_id"));
				dishData.setDishName(rs.getString("Dish_name"));
				dishData.setDishPrice(rs.getInt("Dish_price"));
				dishData.setDishImage(rs.getString("Dish_image"));
				dishData.setDishDescription(rs.getString("Dish_description"));
				dishData.setDishType(rs.getString("Dish_type"));
				dishData.setDishStatus(rs.getString("Dish_status"));
				dishData.setDishTime(rs.getString("Dish_time"));
				dishData.setRestaurants_id(rs.getInt("Restaurants_id"));
				dishData.setDishPreparationTime(rs.getDate("dish_prepration_time"));
				dishData.setDishCreateAt(rs.getDate("dish_created_at"));
				dishData.setDishModifiedAt(rs.getDate("dish_modified_at"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	return dishData;	
	}
	public boolean createDishDetails(DishDO dishDetails) {
		boolean isSuccess=false;
		try {
			Connection con=DbConfig.create();
			String query="insert into dish_details(Dish_id,Dish_name,Dish_price,Dish_type,Dish_image,Dish_description,Dish_status,Dish_time,Restaurants_id,dish_prepration_time,dish_created_at,dish_modified_at) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1, dishDetails.getDishId());
			preparedStatement.setString(2,dishDetails.getDishName());
			preparedStatement.setInt(3, dishDetails.getDishPrice());
			preparedStatement.setString(4, dishDetails.getDishType());
			preparedStatement.setString(5, dishDetails.getDishImage());
			preparedStatement.setString(6, dishDetails.getDishDescription());
			preparedStatement.setString(7,dishDetails.getDishStatus());
			preparedStatement.setString(8, dishDetails.getDishTime());
			preparedStatement.setInt(9, dishDetails.getRestaurants_id());
			preparedStatement.setDate(10, new java.sql.Date(dishDetails.getDishPreparationTime().getTime()));
			preparedStatement.setDate(11,new java.sql.Date(dishDetails.getDishCreateAt().getTime()));
			preparedStatement.setDate(12,new java.sql.Date(dishDetails.getDishModifiedAt().getTime()));
			int result=preparedStatement.executeUpdate();
			if(result!=0) {
			isSuccess=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public boolean deleteDishDetails(int id) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="delete from dish_details where Dish_id=?";
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
	public boolean upadateDishDetails(DishDO dishDo,int id) {
		boolean isSuccess=false;
		try {
				Connection con=DbConfig.create();
				String query="update dish_details Set dish_name=?,Dish_price=?,Dish_image=?,Dish_description=?,Dish_type=?,Dish_status=?,Dish_time=?,Restaurants_id=?,dish_created_at=?,dish_modified_at=?,dish_prepration_time=?,Dish_id=? where dish_id=?";
				PreparedStatement prepareStatement=con.prepareStatement(query);
				prepareStatement.setString(1, dishDo.getDishName());
				prepareStatement.setInt(2, dishDo.getDishPrice());
				prepareStatement.setString(3, dishDo.getDishImage());
				prepareStatement.setString(4, dishDo.getDishDescription());
				prepareStatement.setString(5, dishDo.getDishType());
				prepareStatement.setString(6, dishDo.getDishStatus());
				prepareStatement.setString(7, dishDo.getDishTime());
				prepareStatement.setInt(8, dishDo.getRestaurants_id());
				prepareStatement.setDate(9, new java.sql.Date(dishDo.getDishCreateAt().getTime()));
				prepareStatement.setDate(10, new java.sql.Date(dishDo.getDishModifiedAt().getTime()));
				prepareStatement.setDate(11,new java.sql.Date(dishDo.getDishPreparationTime().getTime()));
				prepareStatement.setInt(12, dishDo.getDishId());
				prepareStatement.setInt(13, id);
				prepareStatement.executeUpdate();
				isSuccess=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
}
