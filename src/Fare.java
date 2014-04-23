/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Fare {
    Employee eta = new Employee();
    Cars car = new Cars();
    String expectMiles = "";
    String expectTime = "";
    String fareListName ="";
    String fareCarListName="";
    int fareFee = 0;
    int empPay = 0;
    
    public Fare(){
        
    }
    public Fare(Employee e, Cars d, String x, String y, int z, int v){
        eta = e;
        car=d;
        expectMiles = x;
        expectTime= y;
        fareListName=e.getListName();
        fareCarListName=d.getCarListName();
        fareFee = z;
        empPay = v;
    }
    public String getFareListName(){
       return fareListName; 
    }
    public String getExpectMiles(){
        return expectMiles;
    }
    public String getExpectedTime(){
        return expectTime;
    }
    
    public String getCarListName(){
        return fareCarListName;
    }
    
    public int getFareFee(){
        return fareFee;
    }
    
    public int getEmpPay(){
        return empPay;
    }
    @Override
    public String toString(){
        return fareListName;
    }
}
