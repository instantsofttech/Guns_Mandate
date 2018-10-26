/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AssistantRole;
import Business.Role.DirectorRole;
import Business.Role.FBIAgentRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class FBIOrganization extends Organization{
    
      public FBIOrganization() {
          
        super(Organization.Type.FBI.getValue());
        
      }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new DirectorRole());
        roles.add(new FBIAgentRole());
        roles.add(new AssistantRole());   
        
        return null;
    }
     
}
