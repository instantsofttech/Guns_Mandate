/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreManager;

import Business.Organization.WarehouseOrganization;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Administrator
 */
public class StoreManager {
    private String supplierName;
    private static int sCount;
    private String supplierId;
    private FirearmDirectory firearmList;
    private WorkQueue workQueue;
    
    public StoreManager(){
        supplierId= "SID"+(++sCount);
        firearmList= new FirearmDirectory();
        workQueue= new WorkQueue();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public FirearmDirectory getFirearmList() {
        return firearmList;
    }

    public void setFirearmList(FirearmDirectory firearmList) {
        this.firearmList = firearmList;
    }
    
    @Override
    public String toString(){
        return supplierName;
    }
    
}
