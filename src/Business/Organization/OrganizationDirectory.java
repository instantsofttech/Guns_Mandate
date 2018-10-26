/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.Police.getValue())){
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FBI.getValue())){
            organization = new FBIOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Warehouse.getValue())){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}