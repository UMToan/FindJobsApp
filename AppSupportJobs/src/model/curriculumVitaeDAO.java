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
public class curriculumVitaeDAO {
    Connection conn = null;
    PreparedStatement sttm = null;
    public int addCV(curriculumVitae cv){
        try {
            String SQL = "INSERT INTO curriculumVitae (curriculumVitae_id ,account_id, name, mail, date_of_birth, phone_number, address, university, major, description, graduation_year, skills, experience, certificate)" 
                    + "VALUES (? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, cv.getCurriculumVitae_id());
            sttm.setString(2, cv.getAccount_id());
            sttm.setString(3, cv.getName());
            sttm.setString(4, cv.getMail());
            sttm.setString(5, cv.getDate_of_birth());
            sttm.setString(6, cv.getPhone_number());
            sttm.setString(7, cv.getAddress());
            sttm.setString(8, cv.getUniversity());
            sttm.setString(9, cv.getMajor());
            sttm.setString(10, cv.getDescription());
            sttm.setString(11, cv.getGraduation_year());
            sttm.setString(12, cv.getSkills());
            sttm.setString(13, cv.getExperience());
            sttm.setString(14, cv.getCertificate());
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
    
    public int updateCV(curriculumVitae cv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String SQL = "UPDATE curriculumVitae SET account_id = ?, name = ?, mail = ?, date_of_birth = ?, phone_number = ?, address = ?, university = ?, major = ?, description = ?, graduation_year = ?, skills = ?, experience = ?, certificate = ? WHERE curriculumVitae_id = ?";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(14, cv.getCurriculumVitae_id());
            sttm.setString(1, cv.getAccount_id());
            sttm.setString(2, cv.getName());
            sttm.setString(3, cv.getMail());
            sttm.setString(4, cv.getDate_of_birth());
            sttm.setString(5, cv.getPhone_number());
            sttm.setString(6, cv.getAddress());
            sttm.setString(7, cv.getUniversity());
            sttm.setString(8, cv.getMajor());
            sttm.setString(9, cv.getDescription());
            sttm.setString(10, cv.getGraduation_year());
            sttm.setString(11, cv.getSkills());
            sttm.setString(12, cv.getExperience());
            sttm.setString(13, cv.getCertificate());
            if(sttm.executeUpdate() > 0){
                System.out.println("UPDATE thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        }
        return -1;
    }
    
    public int deleteCV(String cv){
        try {
            String SQL = "DELETE curriculumVitae WHERE curriculumVitae_id = ?";
            conn = connectDB.getDBConnect();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, cv);
            if(sttm.executeUpdate() > 0){
                System.out.println("DELETE thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Err: " + e.toString());
        }
        return -1;
    }
    
    public List<curriculumVitae> getAllCurriculumVitae(){
        List<curriculumVitae> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String SQL = "SELECT * FROM curriculumVitae ORDER BY curriculumVitae_id DESC";
            conn = connectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            while(rs.next()){
                curriculumVitae cv = new curriculumVitae();
                cv.setCurriculumVitae_id(rs.getString(1));
                cv.setAccount_id(rs.getString(2));
                cv.setName(rs.getString(3));
                cv.setMail(rs.getString(4));
                cv.setDate_of_birth(rs.getString(5));
                cv.setPhone_number(rs.getString(6));
                cv.setAddress(rs.getString(7));
                cv.setUniversity(rs.getString(8));
                cv.setMajor(rs.getString(9));
                cv.setDescription(rs.getString(10));
                cv.setGraduation_year(rs.getString(11));
                cv.setSkills(rs.getString(12));
                cv.setExperience(rs.getString(12));
                cv.setCertificate(rs.getString(12));
                ls.add(cv);
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
    
    public curriculumVitae getCVByID(String id){
        
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String SQL = "SELECT * FROM curriculumVitae WHERE curriculumVitae_id = '"+ id +"'";
            conn = connectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            while(rs.next()){
                curriculumVitae cv = new curriculumVitae();
                cv.setCurriculumVitae_id(rs.getString(1));
                cv.setAccount_id(rs.getString(2));
                cv.setName(rs.getString(3));
                cv.setMail(rs.getString(4));
                cv.setDate_of_birth(rs.getString(5));
                cv.setPhone_number(rs.getString(6));
                cv.setAddress(rs.getString(7));
                cv.setUniversity(rs.getString(8));
                cv.setMajor(rs.getString(9));
                cv.setDescription(rs.getString(10));
                cv.setGraduation_year(rs.getString(11));
                cv.setSkills(rs.getString(12));
                cv.setExperience(rs.getString(13));
                cv.setCertificate(rs.getString(14));
                return cv;
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
