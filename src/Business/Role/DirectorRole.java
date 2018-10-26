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
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FBI.DirectorJPanel;
//import userinterface.FBI.DirectorWorkAreaJPanel;
//import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class DirectorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new DirectorJPanel(userProcessContainer, account,  organization,  enterprise, network, business ); //new DirectorWorkAreaJPanel(userProcessContainer,  account, (PoliceOrganization) organization,  enterprise,  business);
    }
     @Override
    public String toString(){
        return RoleType.Director.getValue();
    }
}
