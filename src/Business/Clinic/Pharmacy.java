/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import Business.Organization.PoliceOrganization;
import Business.Organization.Organization;
import Business.StoreManager.Firearm;
import Business.StoreManager.FirearmDirectory;

/**
 *
 * @author Administrator
 */
public class Pharmacy {
    private FirearmDirectory vaccineList;
    private String pharmacyName;

    public Pharmacy(){
        vaccineList= new FirearmDirectory();
    }
    
    public FirearmDirectory getVaccine() {
        return vaccineList;
    }

    public void setVaccine(FirearmDirectory vaccine) {
        this.vaccineList = vaccine;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    
    @Override
    public String toString(){
        return pharmacyName;
    }
    
}
