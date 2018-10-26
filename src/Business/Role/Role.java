/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        
        SystemAdmin("SystemAdmin"),
        Director("Director"),
        FBIAgent("FBIAgent"),
        Assistant("Assistant"),
        PolicePersonnel("PolicePersonnel"),
        DepartmentHead("DepartmentHead"),
        Admin("Admin"),
        StoreManager("StoreManager"),
        WarehouseManager("WarehouseManager"),
        MediaPersonnel("MediaPersonnel");
          
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Network net,
            EcoSystem business
     );

    @Override
    public String toString() {
        return this.getClass().getName();
    }  
}