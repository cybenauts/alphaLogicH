package com.alphalogicadmin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.alphalogicadmin.model.Admin;

public class AdminAuth {

	public AdminAuth() {
		
	}
	
	public static boolean isAuth(Admin ad){
		boolean flag=false;
		try(Connection con=MySqlConnection.getConnection()){
			PreparedStatement ps=con.prepareStatement("select aEmail,aPassword from admin where aEmail=? and aPassword=?");
			ps.setString(1, ad.getaEmail());
			ps.setString(2, ad.getaPassword());
			System.out.println("Checking email/pass in DB:::"+ad.getaEmail()+":::"+ad.getaPassword());
			ResultSet rs = ps.executeQuery();
			String email="a";
			String pass="b";
			while(rs.next()){
			email=rs.getString(1);
			pass=rs.getString(2);
			}
			if(email.equalsIgnoreCase(ad.getaEmail())&& pass.equalsIgnoreCase(ad.getaPassword())){
				flag = true;
				System.out.println("Authorized in DB");
			}else{
				System.out.println("Invalid Auth in DB");
			}
		}
		
		catch(Exception e){
			System.out.println("Exception in Admin Auth "+e);
		}
		return flag;
		
	}

}
