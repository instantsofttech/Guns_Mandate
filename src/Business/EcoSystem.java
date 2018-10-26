package Business;

import Business.Enterprise.Enterprise;
import Business.FBI.CriminalDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.StoreManagerRole;
import Business.Role.DirectorRole;
import Business.Role.WarehouseManagerRole;
import Business.Role.DepartmentHeadRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.StoreManager.CustomerDirectory;
import Business.StoreManager.FirearmDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private FirearmDirectory firearmList;
    private CustomerDirectory customerList;
    private CriminalDirectory criminalList;
    
     private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
       firearmList= new FirearmDirectory();
       customerList= new CustomerDirectory();
       criminalList= new CriminalDirectory();
       
    }

    public FirearmDirectory getFirearmList() {
        return firearmList;
    }

    public void setFirearmList(FirearmDirectory firearmList) {
        this.firearmList = firearmList;
    }

    public CriminalDirectory getCriminalList() {
        return criminalList;
    }

    public void setCriminalList(CriminalDirectory criminalList) {
        this.criminalList = criminalList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

   

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    
    public static void setInstance(EcoSystem system) {
        business=system;
    }
    
    public CustomerDirectory getCustomerList() {
        return customerList;
    }
    
    
    public void setCustomerList(CustomerDirectory customerList) {
        this.customerList = customerList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        
        
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (Network network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                 if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                            }
                        }
             }

       

        return true;
    }
}