
package com.fit.dao;

import com.fit.model.CFMEMemberModel;
import java.util.List;

/**
 *
 * @author Sushanth Bangera
 */
public interface CFMEMemberDAO {
    
    public void addMember(CFMEMemberModel member);
    
    public void updateMember(CFMEMemberModel member);
    
    public void deleteMember(int id);
    
    public CFMEMemberModel findMember(int id);
    
    public CFMEMemberModel findMember(String na);
     
    public List<CFMEMemberModel> getMembers(); 
    
    
}
