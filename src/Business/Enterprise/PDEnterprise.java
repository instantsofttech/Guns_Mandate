/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DepartmentHeadRole;
import Business.Role.PolicePersonnelRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class PDEnterprise extends Enterprise{

    public PDEnterprise(String name) {
        super(name, EnterpriseType.PD);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new DepartmentHeadRole());
        roles.add(new PolicePersonnelRole());
        
        return roles;
    }
    
    
    
}
