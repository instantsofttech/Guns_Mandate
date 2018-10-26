/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Warehouse.StoreManager.ManageCustomerJPanel;
/**
 *
 * @author Administrator
 */
public class StoreManagerRole extends Role{
    @Override   
    public JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ManageCustomerJPanel(userProcessContainer,  account, (WarehouseOrganization) organization,enterprise, network,  business);
    }
     @Override
    public String toString(){
        return RoleType.StoreManager.getValue();
    }

    //To change body of generated methods, choose Tools | Templates.
    

  
}
