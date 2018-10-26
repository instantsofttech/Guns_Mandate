/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DepartmentHeadRole;
import Business.Role.PolicePersonnelRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class PoliceOrganization extends Organization{
    
    public PoliceOrganization() {
       
        super(Organization.Type.Police.getValue());
         
    }
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new DepartmentHeadRole());
        roles.add(new PolicePersonnelRole());
        return roles;
    }
     
}