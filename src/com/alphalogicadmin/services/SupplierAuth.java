package com.alphalogicadmin.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.alphalogicadmin.model.Admin;
import com.alphalogicadmin.model.Supplier;
import com.alphalogicadmin.services.MySqlConnection;


	public class SupplierAuth {

		public static int isAuth(Supplier sup){
			int flag=4;
			try(Connection con=MySqlConnection.getConnection()){
				
				PreparedStatement ps=con.prepareStatement("select sStatus from supplier where sEmail=?");
				ps.setString(1, sup.getsEmail());
				ResultSet rs = ps.executeQuery();
				int status=4;
				while(rs.next()){
				status=Integer.parseInt(rs.getString(1));	
				
				}
				
				System.out.println("Checking Supplier Status in DB:::"+status);
				if(status==0){
					flag=0; //Unapproved supplier
				}else if(status==2){
					flag=2; //Deactivsted supplier
				}else if(status==1){
					ps=con.prepareStatement("select sEmail,sPassword from supplier where sEmail=? and sPassword=?");
					ps.setString(1, sup.getsEmail());
					ps.setString(2, sup.getsPassword());
					System.out.println("Checking email/pass in DB:::"+sup.getsEmail()+":::"+sup.getsPassword());
					 rs = ps.executeQuery();
					if(rs.next()){
						System.out.println("Authorized in DB");
						flag = 1;//Active supplier
					}else{
						System.out.println("Invalid Auth in DB");
						flag=3;//email/pass wrong
						}
					}
				}
			
			catch(Exception e){
				System.out.println("Exception in Supplier Auth "+e);
			}
			return flag;
			
		}

	}
