/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DirectorRole;
import Business.Role.FBIAgentRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class FBIEnterprise extends Enterprise{
      public FBIEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FBI);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new DirectorRole());
        roles.add(new FBIAgentRole());
        return roles;
    }
}