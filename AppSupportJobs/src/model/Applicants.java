/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Applicants {
    private String applicants_id;
    private String jobs_id;
    private String curriculumVitae_id;
    private String applicants_date;

    @Override
    public String toString() {
        return "Applicants{" + "applicants_id=" + applicants_id + ", jobs_id=" + jobs_id + ", curriculumVitae_id=" + curriculumVitae_id + ", applicants_date=" + applicants_date + '}';
    }
    
    public Applicants(String applicants_id, String jobs_id, String curriculumVitae_id, String applicants_date) {
        this.applicants_id = applicants_id;
        this.jobs_id = jobs_id;
        this.curriculumVitae_id = curriculumVitae_id;
        this.applicants_date = applicants_date;
    }

    public String getApplicants_id() {
        return applicants_id;
    }

    public void setApplicants_id(String applicants_id) {
        this.applicants_id = applicants_id;
    }

    public String getJobs_id() {
        return jobs_id;
    }

    public void setJobs_id(String jobs_id) {
        this.jobs_id = jobs_id;
    }

    public String getCurriculumVitae_id() {
        return curriculumVitae_id;
    }

    public void setCurriculumVitae_id(String curriculumVitae_id) {
        this.curriculumVitae_id = curriculumVitae_id;
    }

    public String getApplicants_date() {
        return applicants_date;
    }

    public void setApplicants_date(String applicants_date) {
        this.applicants_date = applicants_date;
    }
    
    
    
}
