package com.alphalogicadmin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FillTable {
	String cont;
	public FillTable() {
		super();
	}
	String s;
	String icon;
	public  String fillCustomer(){
		try(Connection con=MySqlConnection.getConnection()){
			PreparedStatement ps=con.prepareStatement("select cId,cFirstName,cLastName,cEmail,cStatus,cImageUrl from customer");
			System.out.println("Filling Customer Details");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				if(rs.getString(5).equals("1")){
				s="<i class='fa fa-unlock'></i>";
				}else{
					s="<i class='fa fa-lock'></i>";
				}
				icon="<button type='button' data-toggle='tooltip' title='View Details' class='btn ink-reaction btn-raised btn-primary' onclick='changeStatus(this)'><i class='md md-edit'></i></button>";
		cont+="<tr class='gradeX'> <td>"+
				String.valueOf(rs.getInt(1))+
				"</td> <td>"+rs.getString(2)+
				"</td> <td>"+rs.getString(3)+
				"</td> <td>"+rs.getString(4)+
				"</td> <td>"+icon
				+"</td> <td class='locking'>"+
				s+
				"</td>  </tr>";
		
				
				//mob.put(String.valueOf(rs.getInt(1)), obj);
				
			}
		}catch(Exception e){
			System.out.println("Exception in data filling:"+e);
		}
		return cont;
}
}
