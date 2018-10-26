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
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList= new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
     public Customer addCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    
    //Removing an Employee from the Directory
    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }
    
}
