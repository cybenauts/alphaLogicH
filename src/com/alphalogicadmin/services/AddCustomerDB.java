package com.alphalogicadmin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.alphalogicadmin.model.Customer;
import com.alphalogicadmin.model.CustomerPersonalInfo;

public class AddCustomerDB {

	public AddCustomerDB() {
		// TODO Auto-generated constructor stub
	}
	static int cId=0;
	public static int isAdded(Customer cus,CustomerPersonalInfo cpi){
		boolean flag=false;
		try(Connection con=MySqlConnection.getConnection()){
			
			
			PreparedStatement ps = con.prepareStatement("insert into customer (cFirstName,cLastName,cEmail)values(?,?,?)");
			ps.setString(1, cus.getcFirstName());
			ps.setString(2, cus.getcLastName());
			ps.setString(3, cus.getcEmail());
			System.out.println(cus.getcFirstName()+"::"+cus.getcLastName()+"::"+cus.getcEmail());
			
			
			if(ps.executeUpdate()>0){ //second Way of checking presence
				ps= con.prepareStatement("select cId from customer where cEmail=?");
				ps.setString(1, cus.getcEmail());
				
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					cId=rs.getInt(1);
					System.out.println("CID="+cId);
				}
				ps = con.prepareStatement("insert into customerpersonalinfo (cPhoneNo,cCity,cAddress,cPostalCode,cId)values(?,?,?,?,?)");
				ps.setString(1, cpi.getcPhoneNo());
				ps.setString(2, cpi.getcCity());
				ps.setString(3, cpi.getcAddress1());
				ps.setString(4, cpi.getcPostalCode());
				ps.setInt(5, cId);
				System.out.println(cpi.getcPhoneNo()+"::"+cpi.getcCity());
				if(ps.executeUpdate()>0){
					flag=true;
					System.out.println("Customer Inserted:"+flag);
				}
				
			 
			}
		}catch(Exception e){
			System.out.println("Exception in "+new SupplierInsert().getClass()+":"+e);
			
		}
		
		return cId;
	
	}
}
