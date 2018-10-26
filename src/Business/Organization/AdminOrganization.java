/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        return null;
    }
     
}
