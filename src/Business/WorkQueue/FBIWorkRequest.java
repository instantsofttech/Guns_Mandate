/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Administrator
 */
public class FBIWorkRequest extends WorkRequest{
    private String requestStock;
    private String authorization;

    public String getRequestStock() {
        return requestStock;
    }

    public void setRequestStock(String requestStock) {
        this.requestStock = requestStock;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
   
    
}
