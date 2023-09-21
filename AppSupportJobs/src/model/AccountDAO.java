/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import appsupportjobs.connectDB;
import java.sql.*;
import model.AccountDAO;
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDAO {
    public Account getAccountByID(String id){ 
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        Account acc = new Account();
        try {
            String SQL = "SELECT * FROM account WHERE account_id = ? ";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while(rs.next()){                
                acc.setAccount_id(rs.getString(1));
                acc.setAccount_password(rs.getString(2));
                acc.setAccount_role(rs.getInt(3));
                return acc;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        } finally{
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
    
    public Account checkLogin(String id, String password){
       Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        Account acc = new Account();
        try {
            String SQL = "SELECT * FROM account WHERE account_id = ? ";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while(rs.next()){                
                acc.setAccount_id(rs.getString(1));
                acc.setAccount_password(rs.getString(2));
                acc.setAccount_role(rs.getInt(3));
                return acc;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        } finally{
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
   
}
