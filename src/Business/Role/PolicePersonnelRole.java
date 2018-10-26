/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PD.PolicePersonnel.PolicePersonnelWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class PolicePersonnelRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new PolicePersonnelWorkAreaJPanel(userProcessContainer,  account, organization, enterprise, network,  business);
    }
    @Override
    public String toString(){
        return RoleType.PolicePersonnel.getValue();
    }
    
}
