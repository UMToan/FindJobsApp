/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import appsupportjobs.connectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class JobsDAO {
    Connection conn = null;
    PreparedStatement sttm = null;
    public int addJobs(Jobs jd){
        try {
            String SQL = "INSERT INTO jobs (jobs_id, location_id, jobs_title, jobs_status, post_date, company, jobs_location, jobs_description, jobs_mail, salary, jobs_type, jobs_skill)" 
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, jd.getJobs_id());
            sttm.setString(2, jd.getLocation_id());
            sttm.setString(3, jd.getJobs_title());
            sttm.setString(4, jd.getJobs_status());
            sttm.setString(5, jd.getPost_date());
            sttm.setString(6, jd.getCompany());
            sttm.setString(7, jd.getJobs_location());
            sttm.setString(8, jd.getJobs_description());
            sttm.setString(9, jd.getJobs_mail());
            sttm.setString(10, jd.getSalary());
            sttm.setString(11, jd.getJobs_type());
            sttm.setString(12, jd.getJobs_skill());
            if(sttm.executeUpdate() > 0){
                System.out.println("Insert thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
                
            } catch (Exception e) {
            }
        }
        return -1;
    }
    
    public int updateJobs(Jobs jd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String SQL = "UPDATE jobs SET jobs_title = ?, location_id = ? , jobs_status = ?, post_date = ?, company = ?, jobs_location = ?, jobs_description = ?, jobs_mail = ?, salary = ?, jobs_type = ?, jobs_skill = ? WHERE jobs_id = ?";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, jd.getJobs_title());
            sttm.setString(2, jd.getLocation_id());
            sttm.setString(3, jd.getJobs_status());
            sttm.setString(4, jd.getPost_date());
            sttm.setString(5, jd.getCompany());
            sttm.setString(6, jd.getJobs_location());
            sttm.setString(7, jd.getJobs_description());
            sttm.setString(8, jd.getJobs_mail());
            sttm.setString(9, jd.getSalary());
            sttm.setString(10, jd.getJobs_type());
            sttm.setString(11, jd.getJobs_skill());
            sttm.setString(12, jd.getJobs_id());
            if(sttm.executeUpdate() > 0){
                System.out.println("UPDATE thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        }
        return -1;
    }
    
    public int deleteJobs(String jd){
        try {
            String SQL = "DELETE jobs WHERE jobs_id = ?";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, jd);
            if(sttm.executeUpdate() > 0){
                System.out.println("DELETE thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        }
        return -1;
    }
    
    public List<Jobs> getAllJobs(){
        List<Jobs> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String SQL = "SELECT jobs_id, location_id, jobs_title, jobs_status, post_date, company, jobs_location, jobs_description, jobs_mail, salary, jobs_type, jobs_skill FROM jobs ORDER BY jobs_id DESC";
            conn = connectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            while(rs.next()){
                Jobs jd = new Jobs();
                jd.setJobs_id(rs.getString(1));
                jd.setLocation_id(rs.getString(2));
                jd.setJobs_title(rs.getString(3));
                jd.setJobs_status(rs.getString(4));
                jd.setPost_date(rs.getString(5));
                jd.setCompany(rs.getString(6));
                jd.setJobs_location(rs.getString(7));
                jd.setJobs_description(rs.getString(8));
                jd.setJobs_mail(rs.getString(9));
                jd.setSalary(rs.getString(10));
                jd.setJobs_type(rs.getString(11));
                jd.setJobs_skill(rs.getString(12));
                ls.add(jd);
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
        return ls;
    }
    
    public Jobs getJobsByID(String id){
        
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String SQL = "SELECT * FROM jobs WHERE jobs_id = '"+ id +"'";
            conn = connectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            while(rs.next()){
                Jobs jd = new Jobs();
                jd.setJobs_id(rs.getString(1));
                jd.setLocation_id(rs.getString(2));
                jd.setJobs_title(rs.getString(3));
                jd.setJobs_status(rs.getString(4));
                jd.setPost_date(rs.getString(5));
                jd.setCompany(rs.getString(6));
                jd.setJobs_location(rs.getString(7));
                jd.setJobs_description(rs.getString(8));
                jd.setJobs_mail(rs.getString(9));
                jd.setSalary(rs.getString(10));
                jd.setJobs_type(rs.getString(11));
                jd.setJobs_skill(rs.getString(12));
                return jd;
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
    
    public List<Jobs> getJobsByName(String name){
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        List<Jobs> ls = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM jobs WHERE jobs_title LIKE '%"+ name +"%'";
            conn = connectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            while(rs.next()){
                Jobs jd = new Jobs();
                jd.setJobs_id(rs.getString(1));
                jd.setLocation_id(rs.getString(2));
                jd.setJobs_title(rs.getString(3));
                jd.setJobs_status(rs.getString(4));
                jd.setPost_date(rs.getString(5));
                jd.setCompany(rs.getString(6));
                jd.setJobs_location(rs.getString(7));
                jd.setJobs_description(rs.getString(8));
                jd.setJobs_mail(rs.getString(9));
                jd.setSalary(rs.getString(10));
                jd.setJobs_type(rs.getString(11));
                jd.setJobs_skill(rs.getString(12));
                ls.add(jd);
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        }finally{
            try {
                conn.close();
                rs.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
   
}
