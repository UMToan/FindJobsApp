/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class curriculumVitae {
    private String curriculumVitae_id;
    private String account_id;
    private String name;
    private String mail;
    private String date_of_birth;
    private String phone_number;
    private String address;
    private String university;
    private String major;
    private String description;
    private String graduation_year;
    private String skills;
    private String experience;
    private String certificate;

    @Override
    public String toString() {
        return "curriculumVitae{" + "curriculumVitae_id=" + curriculumVitae_id + ", account_id=" + account_id + ", name=" + name + ", mail=" + mail + ", date_of_birth=" + date_of_birth + ", phone_number=" + phone_number + ", address=" + address + ", university=" + university + ", major=" + major + ", description=" + description + ", graduation_year=" + graduation_year + ", skills=" + skills + ", experience=" + experience + ", certificate=" + certificate + '}';
    }

    public curriculumVitae() {
    }
    
    
    
    public curriculumVitae(String curriculumVitae_id, String account_id, String name, String mail, String date_of_birth, String phone_number, String address, String university, String major, String description, String graduation_year, String skills, String experience, String certificate) {
        this.curriculumVitae_id = curriculumVitae_id;
        this.account_id = account_id;
        this.name = name;
        this.mail = mail;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.address = address;
        this.university = university;
        this.major = major;
        this.description = description;
        this.graduation_year = graduation_year;
        this.skills = skills;
        this.experience = experience;
        this.certificate = certificate;
    }

    public String getCurriculumVitae_id() {
        return curriculumVitae_id;
    }

    public void setCurriculumVitae_id(String curriculumVitae_id) {
        this.curriculumVitae_id = curriculumVitae_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(String graduation_year) {
        this.graduation_year = graduation_year;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    
    
}
