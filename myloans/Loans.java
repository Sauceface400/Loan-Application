package myloans;

public class Loans {
    String name;
    String address;
    String status;
    
    public Loans(){
        name = "";
        address = "";
        status = "";
    }
    
    public Loans(String a, String b, String c){
        name = a;
        address = b;
        status = c;
    }
   
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getStatus(){
        return status;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
