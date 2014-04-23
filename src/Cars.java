/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Cars {
    public String plateNum = "";
    public String carModel = "";
    public String carColour = "";
    public String carYear = "";
    public int carNum = 0;
    public int carCumMiles = 0;
    public String carAdded = "";
    public String carRemoved = "";
    public String lastMaint= "";
    public String lastIns = "";
    public String carNotes= "";
    public String carListName = "";
    public int carCumMaint = 0;
    public int carProfit = 0;
    
    
    public Cars(){
        
    }
            
    public Cars(String w){
        carListName = w;
    }
     public String getPlateNum(){
        return plateNum;
    }
    
    public String getCarModel(){
        return carModel;
    }
    
    public String getCarColour(){
        return carColour;
    }
    
    public String getCarYear(){
        return carYear;
    }
    
    public int getCarNum(){
        return carNum;
    }
    
    public int getCarCumMiles(){
        return carCumMiles;
    }
    
    public String getCarAdded(){
        return carAdded;
    }
    
    public String getCarRemoved(){
        return carRemoved;
    }
    public String getLastMaint(){
        return lastMaint;
    }
    public String getLastIns(){
        return lastIns;
    }
    public String getCarNotes(){
        return carNotes;
    }
    public String getCarListName(){
        return carListName;
    }
    
    public int getCarCumMaint(){
        return carCumMaint;
    }
    
    public int getCarProfit(){
        return carProfit;
    }
    
    @Override
    public String toString(){
        return carListName;
    }
}
