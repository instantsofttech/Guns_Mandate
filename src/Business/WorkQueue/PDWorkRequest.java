/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


/**
 *
 * @author punit
 */
public class PDWorkRequest extends WorkRequest {
    private String sendDetails;
    private boolean add;
    
    
    public PDWorkRequest(){
        add = false;
    }
    
    public String getQuantity() {
        return sendDetails;
    }

    public void setQuantity(String details) {
        this.sendDetails = details;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

   
}

    
    

