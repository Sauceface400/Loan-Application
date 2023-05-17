/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myloans;

/**
 *
 * @author user
 */
public class Home {
    String type;
    String location;
    double value;
    
    public Home(){
        type = "";
        location = "";
        value = 0;
    }
    
    public Home(String a, String b, double c){
        type = a;
        location = b;
        value = c;
    }
   
    
    public String getType(){
        return type;
    }
    
    public String getLocation(){
        return location;
    }
    
    public double getValue(){
        return value;
    }
}
