/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myloans;

/**
 *
 * @author user
 */
public class Car {
    String maker;
    String model;
    int year;
    
    public Car(){
        maker = "";
        model = "";
        year = 0;
    }
    
    public Car(String a, String b, int c){
        maker = a;
        model = b;
        year = c;
    }
   
    
    public String getMaker(){
        return maker;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }
}
