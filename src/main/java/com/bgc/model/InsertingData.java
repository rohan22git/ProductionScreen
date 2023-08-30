package com.bgc.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/display")
//public class InsertingData extends HttpServlet {

	/*
	public void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException{
		
		responce.setContentType("text/html");
		PrintWriter out = responce.getWriter();
		
		try {
			
			String dtcreatedatetime = request.getParameter("dtcreatedatetime");
			String idusercreate     = request.getParameter("idusercreate");
			String dtmodifieddatetime = request.getParameter("dtmodifieddatetime");
			String iduserlastmodified  = request.getParameter("iduserlastmodified");
			int  recordversion    =   Integer.parseInt(request.getParameter("recordversion"));
			String BusinessStrategy    = request.getParameter("BusinessStrategy");
			String TransactionType    = request.getParameter("TransactionType");
			String ProductType    = request.getParameter("ProductType");
			String ProductSubType   = request.getParameter("ProductSubType");
			String AmountType    = request.getParameter("AmountType");
			String TargetSystem    = request.getParameter("TargetSystem");
			String TargetTradeType    = request.getParameter("TargetTradeType");
			String TargetTradeSubType    = request.getParameter("TargetTradeSubType");
			String createDate    = request.getParameter("createDate");
			String modifiedDate    = request.getParameter("modifiedDate");
			int isActive   = Integer.parseInt(request.getParameter("isActive"));
			String SettlementType    = request.getParameter("SettlementType");
			 String DealType = request.getParameter("DealType");
			 
			 out.println(dtcreatedatetime);
			 out.println(idusercreate);
			 out.println(dtmodifieddatetime);
			 out.println(iduserlastmodified);
			 out.println(recordversion);
			 out.println(BusinessStrategy);
			 out.println(TransactionType);
			 out.println(ProductType);
			 out.println(ProductSubType);
			 out.println(AmountType);
			 out.println(TargetSystem);
			 out.println(TargetTradeType);
			 out.println(TargetTradeSubType);
			 out.println(createDate);
			 out.println(modifiedDate);
			 out.println(isActive);
			 out.println(DealType);
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","rohan@123");
			 PreparedStatement pst = con.prepareStatement("insert into dbo_product_classification_lookup values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 		
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
*/
	
	/*
	private static final String INSERT_QUERY = 
			"insert into dbo_product_classification_lookup (amount_type,business_strategy,deal_type,product_sub_type,product_type,settlement_type,target_system,target_trade_sub_type,target_trade_type,transaction_type,create_date,dt_create_datetime,dt_modified_datetime,id_user_create,id_user_last_modified,is_active,modified_by,modified_date,record_version,id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			
			
	
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
	        PrintWriter pw = response.getWriter();	        
	        response.setContentType("text/hmtl");
	        
	        String dtcreatedatetime = request.getParameter("dtcreatedatetime");
			String idusercreate     = request.getParameter("idusercreate");
			String dtmodifieddatetime = request.getParameter("dtmodifieddatetime");
			String iduserlastmodified  = request.getParameter("iduserlastmodified");
			int  recordversion    =   Integer.parseInt(request.getParameter("recordversion"));
			String BusinessStrategy    = request.getParameter("BusinessStrategy");
			String TransactionType    = request.getParameter("TransactionType");
			String ProductType    = request.getParameter("ProductType");
			String ProductSubType   = request.getParameter("ProductSubType");
			String AmountType    = request.getParameter("AmountType");
			String TargetSystem    = request.getParameter("TargetSystem");
			String TargetTradeType    = request.getParameter("TargetTradeType");
			String TargetTradeSubType    = request.getParameter("TargetTradeSubType");
			String createDate    = request.getParameter("createDate");
			String modifiedDate    = request.getParameter("modifiedDate");
			int isActive   = Integer.parseInt(request.getParameter("isActive"));
			String SettlementType    = request.getParameter("SettlementType");
			 String DealType = request.getParameter("DealType");
			 
			 try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
			 
			 try(Connection con = DriverManager.getConnection("jdbc:mysql:///production","root","rohan@123");
		                PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
	        
				 	ps.setString(1, dtcreatedatetime);
		            ps.setString(2, idusercreate);
		            ps.setString(3, dtmodifieddatetime);
		            ps.setString(4, iduserlastmodified);
		            ps.setInt(5, recordversion);
		            ps.setString(6, BusinessStrategy);
		            ps.setString(7, TransactionType);
		            ps.setString(8, ProductType);
		            ps.setString(9, ProductSubType);
		            ps.setString(10, AmountType);
		            ps.setString(11, TargetSystem);
		            ps.setString(12, TargetTradeType);
		            ps.setString(13, TargetTradeSubType);
		            ps.setString(14, createDate);
		            ps.setString(15, modifiedDate);
		            ps.setInt(16, isActive);
		            ps.setString(17, SettlementType);
		            ps.setString(18, DealType);
		            
		            int count = ps.executeUpdate();
		            
		            if(count==0) {
		                pw.println("Record not stored into database");
		            }else {
		                pw.println("Record Stored into Database");
		            }
			 }  
		            catch(SQLException se) {
		                pw.println(se.getMessage());
		                se.printStackTrace();
		            }catch(Exception e) {
		                pw.println(e.getMessage());
		                e.printStackTrace();
		            }
		            pw.close();

			 }
	 
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        doGet(req, resp);
	    }
*/
// }
