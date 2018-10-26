/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AssistantRole;
import Business.Role.DirectorRole;
import Business.Role.FBIAgentRole;
import Business.Role.MediaPersonnelRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class MediaOrganization extends Organization{
    
      public MediaOrganization() {
          
        super(Organization.Type.Media.getValue());
        
      }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new MediaPersonnelRole());   
        
        return null;
    }
}
