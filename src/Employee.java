/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Employee {
    public String listName = "";
    public String firstName = "";
    public String lastName = "";
    public int dl = 0;
    public String dlState = "";
    public int empNum = 0;
    public int cumlMiles = 0;
    public String empNotes = "";
    public String hireDate = "";
    public String fireDate = "";
    public String inf = "";
    public int cumPay = 0;
    public int yearPay=0;
    public int empProfit=0;
    
    public Employee(){
        
    }
            
    public Employee(String w){
        listName = w;
    }
     public int getEmpID(){
        return empNum;
    }
    
    public String getListName(){
        return listName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getdlState(){
        return dlState;
    }
    
    public int getdl(){
        return dl;
    }
    
    public int getCumMiles(){
        return cumlMiles;
    }
    
    public String getempNotes(){
        return empNotes;
    }
    public String gethdate(){
        return hireDate;
    }
    public String getfdate(){
        return fireDate;
    }
    public String getInf(){
        return inf;
    }
    
    public int getCumPay(){
        return cumPay;
    }
    
    public int getYearPay(){
        return yearPay;
    }
    public int getEmpProfit(){
        return empProfit;
    }
    
    @Override
    public String toString(){
        return listName;
    }
}
