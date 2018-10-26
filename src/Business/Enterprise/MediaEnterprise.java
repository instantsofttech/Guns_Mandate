/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class MediaEnterprise extends Enterprise{
    
      public MediaEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Media);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        
        return roles;
    }
}
