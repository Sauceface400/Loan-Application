package myloans;

public class Loans {
    String name;
    int age;
    double amount;
    
    public Loans(){
        name = "";
        age = 0;
        amount = 0;
    }
    
    public Loans(String a, int b, double c){
        name = a;
        age = b;
        amount = c;
    }
   
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getAmount(){
        return amount;
    }
}
