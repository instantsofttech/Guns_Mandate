/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreManager;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FirearmDirectory {
    private ArrayList<Firearm> firearmList;
    
    public FirearmDirectory(){
        firearmList= new ArrayList<>();
                
    }

    public ArrayList<Firearm> getFirearmList() {
        return firearmList;
    }

    public void setFirearmList(ArrayList<Firearm> firearmList) {
        this.firearmList = firearmList;
    }
    
       public Firearm addFirearm() {
        Firearm firearm = new Firearm();
        firearmList.add(firearm);
        return firearm;
    }
    
    
    public void removefirearm(Firearm firearm) {
        firearmList.remove(firearm);
    }
    
}
