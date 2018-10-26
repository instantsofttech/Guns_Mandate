/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreManagerRole;
import Business.StoreManager.CustomerDirectory;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class WarehouseOrganization extends Organization{
private CustomerDirectory customerList;
    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
        customerList= new CustomerDirectory();
    }

    public CustomerDirectory getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerDirectory customerList) {
        this.customerList = customerList;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new StoreManagerRole());
        return null;
    } 
}
