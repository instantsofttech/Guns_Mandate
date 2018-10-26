/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FBI;

import Business.StoreManager.CustomerDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author punit
 */
public class Criminal {
    
    private String CriminalName;
    private String cContactNumber;
    private String cAge;
    private String cAddress;
    private String cSex;
    private static int ccCount;

    public void setCriminalId(String CriminalId) {
        this.CriminalId = CriminalId;
    }
    private String CriminalId;
    private CustomerDirectory CustomerList;
    private WorkQueue workQueue;

    public String getcContactNumber() {
        return cContactNumber;
    }

    public void setcContactNumber(String cContactNumber) {
        this.cContactNumber = cContactNumber;
    }

    public String getcAge() {
        return cAge;
    }

    public void setcAge(String cAge) {
        this.cAge = cAge;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }
    
    
    public Criminal(){
        CriminalId= "CIDs"+(++ccCount);
        CustomerList= new CustomerDirectory();
        workQueue= new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getCriminalName() {
        return CriminalName;
    }

    public void setCriminalName(String criminalName) {
        this.CriminalName = criminalName;
    }

    public String getCriminalId() {
        return CriminalId;
    }

    public void setCustomerId(String customerId) {
        this.CriminalId = customerId;
    }

    public CustomerDirectory getcustomerList() {
        return CustomerList;
    }

    public void setCustomerList(CustomerDirectory customerList) {
        this.CustomerList = customerList;
    }
    
    @Override
    public String toString(){
        return CriminalName;
    }

    
}
