/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FBI;

import Business.FBI.Criminal;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class CriminalDirectory {
    private ArrayList<Criminal> criminalList;
    
    public CriminalDirectory(){
        criminalList= new ArrayList<>();
    }

    public ArrayList<Criminal> getCriminalList() {
        return criminalList;
    }

    public void setCriminalList(ArrayList<Criminal> criminalList) {
        this.criminalList = criminalList;
    }
     public Criminal addCriminal() {
        Criminal criminal = new Criminal();
        criminalList.add(criminal);
        return criminal;
    }
    
    //Removing an Employee from the Directory
    public void removeCriminal(Criminal criminal) {
        criminalList.remove(criminal);
    }
}
    