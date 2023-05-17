/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myloans;

/**
 *
 * @author user
 */
public class Account {
    String name;
    int age; 
    int pin; 
    double deposit;
    double withdraw; 
    double balance;
    
    public Account(){
        name = "";
        age = 0;
        pin = 0;
        deposit = 0;
        withdraw = 0; 
        balance = 0; 
    }
    
    public Account(String a, int b, int c, double d, double e, double f){
        name = a;
        age = b;
        pin = c;
        deposit = d;
        withdraw = e; 
        balance = f; 
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getPin(){
        return pin;
    }
    
    public double getDeposit(){
        return deposit;
    }
    
    public double getWithdraw(){
        return withdraw;
    }
    
    public double getBalance(){
        return balance;
    }
    
}
