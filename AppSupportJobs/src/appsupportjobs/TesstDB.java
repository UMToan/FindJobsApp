/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsupportjobs;
import java.sql.*;
import model.Account;
import model.AccountDAO;
import model.JobsDAO;
import model.Jobs;
import model.curriculumVitaeDAO;
import model.curriculumVitae;
/**
 *
 * @author Admin
 */
public class TesstDB {
    public static void main(String [] args){
        Connection conn = connectDB.getDBConnect();
        //JobsDAO dao = new JobsDAO();
        //if(conn != null){
            //System.out.println("Connect thanh cong");
            //Jobs jd = new Jobs("J003","HCM","Web Developer","Open","15/07/2023","ABC Company","TP.HCM","Develop software applications","Responsibilities include coding and testing","5000 USD","Full-time","Java, C++, SQL"); 
            //dao.addJobs(jd);
            //dao.getAllJobs();
            //System.out.println("=>"+ dao.getJobsByName("De"));
//            Jobs jd = new Jobs("J002", "Intern/Fresher DevOps", "Close", "17/07/2023", "Viettel", "Da Nang", "Chúng tôi đang tìm kiếm những thành viên trong nhóm luôn cố gắng giải quyết các vấn đề khó khăn", "Hoàn thành deline đúng tiến độ", "Up to $3300", "Full-time ", "4+ years of relevant DevOps or SRE experience.");
//            dao.updateJobs(jd);
            //fix cai update
//            Jobs jd1 = new Jobs("J003");
//            dao.deleteJobs(jd1);
        curriculumVitaeDAO dao = new curriculumVitaeDAO();
        if(conn != null){
            curriculumVitae cv = new curriculumVitae("CV03", "201107002", "Loc", "loc@gmail.com", "1990-05-15", "0111222333", "123 Main Street", "ABC University", "Computer Science", "Experienced software developer", "2015-05-01", "Java, C#, SQL", "5 years", "Microsoft Certified Developer");
            //System.out.println("=> " + dao.getAccountByID("201107002"));
            dao.addCV(cv);
        }
        else {
            System.out.println("Connect that bai");
        }
    }
}
