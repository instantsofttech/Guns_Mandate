/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreManager;

import Business.StoreManager.Customer;
/**
 *
 * @author Administrator
 */
public class Firearm {
    private String firearmName;
    private String firearmId;
    private String manufacturer;
      private String type;
    private String numberBullets;
    private static int vCount;
    private Customer customer;
    private String quantity;
    
    public Firearm(){
        firearmId= "FA"+(++vCount);
        customer= new Customer();
    }

    public void setFirearmId(String firearmId) {
        this.firearmId = firearmId;
    }
  

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumberBullets() {
        return numberBullets;
    }

    public void setNumberBullets(String numberBullets) {
        this.numberBullets = numberBullets;
    }
    
     
    public String getFirearmName() {
        return firearmName;
    }

    public void setFirearmName(String firearmName) {
        this.firearmName = firearmName;
    }

    public String getFirearmId() {
        return firearmId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
     @Override
    public String toString(){
    return firearmName;
    }
}