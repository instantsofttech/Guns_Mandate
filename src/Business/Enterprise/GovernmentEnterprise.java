/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.StoreManagerRole;
import Business.Role.WarehouseManagerRole;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class GovernmentEnterprise extends Enterprise{
      public GovernmentEnterprise(String name) {
        super(name, EnterpriseType.Government);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new WarehouseManagerRole());
        roles.add(new StoreManagerRole());
       
        return roles;
    }
}
