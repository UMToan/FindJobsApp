/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Account {
    private String account_id;
    private String account_password;
    private int account_role;

    @Override
    public String toString() {
        return "Account{" + "account_id=" + account_id + ", account_password=" + account_password + ", account_role=" + account_role + '}';
    }

    public Account() {
    }

    
    
    public Account(String account_id, String account_password, int account_role) {
        this.account_id = account_id;
        this.account_password = account_password;
        this.account_role = account_role;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public int getAccount_role() {
        return account_role;
    }

    public void setAccount_role(int account_role) {
        this.account_role = account_role;
    }
    
    
}
