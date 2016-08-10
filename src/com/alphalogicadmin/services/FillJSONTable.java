package com.alphalogicadmin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject; //for Json Encoding


public class FillJSONTable {

	public FillJSONTable() {
	super();	
	}
	
	JSONObject mob = new JSONObject();
	JSONArray arr = new JSONArray();
@SuppressWarnings("unchecked")
public  JSONArray fillCustomer(){
	try(Connection con=MySqlConnection.getConnection()){
		PreparedStatement ps=con.prepareStatement("select cId,cFirstName,cLastName,cEmail,cImageUrl from customer");
	
		System.out.println("Filling Customer Details");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			JSONObject obj = new JSONObject();
			//JSONArray arr = new JSONArray();
			obj.put("cId",rs.getInt(1));
			obj.put("cFirstName",rs.getString(2));
			obj.put("cLastName", rs.getString(3));
			obj.put("cEmail", rs.getString(4));
			obj.put("cImageUrl", rs.getString(5));
			
			arr.add(obj);
			
			//mob.put(String.valueOf(rs.getInt(1)), obj);
			
		}
	
	}
	
	

	catch(Exception e){
		System.out.println("Exception in Admin Auth "+e);
	}
	return arr;

	
}
}
	


