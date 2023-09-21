/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Area {
    private String location_id;
    private String location_name;

    @Override
    public String toString() {
        return "Area{" + "location_id=" + location_id + ", location_name=" + location_name + '}';
    }

    
    
    public Area(String location_id, String location_name) {
        this.location_id = location_id;
        this.location_name = location_name;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }
    
    
}
