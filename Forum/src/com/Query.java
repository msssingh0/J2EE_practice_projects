package com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
	public Query() {
		new Connector(); 
	}
	public String[][] selectAll(){
		String[][] table=null;
		try {
			Statement st=Connector.con.createStatement();
			ResultSet rs=st.executeQuery("select * from question;");
			int count=0;
			while(rs.next()){
				count++;
			}
			table=new String[count++][count++];
			rs.beforeFirst();
			for(int i=0;rs.next();i++){
				table[i][0]=rs.getString(1);
				table[i][1]=rs.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return table;
	}
	public String[] answer(int index) {
		String[] result=null;
		try {
			
			PreparedStatement pst=Connector.con.prepareStatement("select answer from answer where id=?");
			pst.setInt(1, index+1); int count=0;
			ResultSet rs =  pst.executeQuery();
			while(rs.next())
				count++;
			rs.beforeFirst();
			result=new String[count];
			for(int j=0;rs.next();j++)
				result[j]=rs.getString(1);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
	
	public  int putAnswer (int id,String ans) {
		int res=-1;
		try {
			PreparedStatement pst=Connector.con.prepareStatement("insert into answer values (?,?)");
			pst.setInt(1, id+1);
			pst.setString(2, ans);
			res=pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
	}
	
	public  int submitQuestion (String question) {
		int res=-1;
		 try {
			PreparedStatement pst=Connector.con.prepareStatement("insert into question (question) values ( ?)");
			pst.setString(1,question);
			res=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
}
