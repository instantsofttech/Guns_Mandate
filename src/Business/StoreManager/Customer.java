/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreManager;

import Business.FBI.CriminalDirectory;
import Business.Organization.WarehouseOrganization;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Administrator
 */
public class Customer {
     private String CustomerName;
    private String CustomerId;
    private CriminalDirectory criminalList;
    private WorkQueue workQueue;
    private String email;
    private String contactNumber;
    private String age;
    private String address;
    private String sex;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
  

 
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        this.CustomerId = customerId;
    }

    public CriminalDirectory getCriminalList() {
        return criminalList;
    }

    public void setCriminalList(CriminalDirectory CriminalList) {
        this.criminalList = CriminalList;
    }
    
    @Override
    public String toString(){
        return CustomerName;
    }

  
}
