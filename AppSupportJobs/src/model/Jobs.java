/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Jobs {
    private String jobs_id;
    private String location_id;
    private String jobs_title;
    private String jobs_status;
    private String post_date;
    private String company;
    private String jobs_location;
    private String jobs_description;
    private String jobs_mail;
    private String salary;
    private String jobs_type;
    private String jobs_skill;
    
    public Jobs(){}

    @Override
    public String toString() {
        return "Jobs{" + "jobs_id=" + jobs_id + ", location_id=" + location_id + ", jobs_title=" + jobs_title + ", jobs_status=" + jobs_status + ", post_date=" + post_date + ", company=" + company + ", jobs_location=" + jobs_location + ", jobs_description=" + jobs_description + ", jobs_mail=" + jobs_mail + ", salary=" + salary + ", jobs_type=" + jobs_type + ", jobs_skill=" + jobs_skill + '}';
    }
    
    
    public Jobs(String jobs_id){
        this.jobs_id = jobs_id;
    }
    
    public Jobs(String jobs_id, String location_id, String jobs_title, String jobs_status, String post_date, String company, String jobs_location, String jobs_description, String jobs_mail, String salary, String jobs_type, String jobs_skill) {
        this.jobs_id = jobs_id;
        this.location_id = location_id;
        this.jobs_title = jobs_title;
        this.jobs_status = jobs_status;
        this.post_date = post_date;
        this.company = company;
        this.jobs_location = jobs_location;
        this.jobs_description = jobs_description;
        this.jobs_mail = jobs_mail;
        this.salary = salary;
        this.jobs_type = jobs_type;
        this.jobs_skill = jobs_skill;
    }

    public Jobs(String jobs_id, String jobs_title, String jobs_status, String post_date, String company, String jobs_location, String jobs_description, String jobs_mail, String salary, String jobs_type, String jobs_skill) {
        this.jobs_id = jobs_id;
        this.jobs_title = jobs_title;
        this.jobs_status = jobs_status;
        this.post_date = post_date;
        this.company = company;
        this.jobs_location = jobs_location;
        this.jobs_description = jobs_description;
        this.jobs_mail = jobs_mail;
        this.salary = salary;
        this.jobs_type = jobs_type;
        this.jobs_skill = jobs_skill;
    }

    public String getJobs_id() {
        return jobs_id;
    }

    public void setJobs_id(String jobs_id) {
        this.jobs_id = jobs_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getJobs_title() {
        return jobs_title;
    }

    public void setJobs_title(String jobs_title) {
        this.jobs_title = jobs_title;
    }

    public String getJobs_status() {
        return jobs_status;
    }

    public void setJobs_status(String jobs_status) {
        this.jobs_status = jobs_status;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobs_location() {
        return jobs_location;
    }

    public void setJobs_location(String jobs_location) {
        this.jobs_location = jobs_location;
    }

    public String getJobs_description() {
        return jobs_description;
    }

    public void setJobs_description(String jobs_description) {
        this.jobs_description = jobs_description;
    }

    public String getJobs_mail() {
        return jobs_mail;
    }

    public void setJobs_mail(String jobs_mail) {
        this.jobs_mail = jobs_mail;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobs_type() {
        return jobs_type;
    }

    public void setJobs_type(String jobs_type) {
        this.jobs_type = jobs_type;
    }

    public String getJobs_skill() {
        return jobs_skill;
    }

    public void setJobs_skill(String jobs_skill) {
        this.jobs_skill = jobs_skill;
    }
    
    
}
