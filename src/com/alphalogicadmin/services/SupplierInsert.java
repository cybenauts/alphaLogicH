package com.alphalogicadmin.services;

import com.alphalogicadmin.model.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SupplierInsert {

	public SupplierInsert() {
		
	}
	public static boolean isInserted(Supplier sup){
		boolean flag=false;
		try(Connection con=MySqlConnection.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("select sEmail from supplier where sEmail=?");
			ps.setString(1, sup.getsEmail());
			ResultSet rs = ps.executeQuery(); 
			if(rs.next()){ //first Way of checking presence
				System.out.println("Already Present in DB");
				flag = false;
			}else{
			ps = con.prepareStatement("insert into supplier (sFirstName,sLastName,sEmail,sPassword,sCompanyName)values(?,?,?,?,?)");
			ps.setString(1, sup.getsFirstName());
			ps.setString(2, sup.getsLastName());
			ps.setString(3, sup.getsEmail());
			ps.setString(4, sup.getsPassword());
			ps.setString(5, sup.getsCompanyName());
			
			if(ps.executeUpdate()>0){ //second Way of checking presence
				flag=true;
				System.out.println("User Inserted:"+flag);
			 }
			}
		}catch(Exception e){
			System.out.println("Exception in "+new SupplierInsert().getClass()+":"+e);
			
		}
		
		return flag;
	}
}
