
package com.fit.dao;

import com.fit.model.CFMEMemberModel;
import java.util.List;

/**
 *
 * @author Sushanth Bangera
 */
public interface CFMEMemberDAO {
    
    public void saveMember(CFMEMemberModel member);
    
    public CFMEMemberModel findMember(int id);
    
    public CFMEMemberModel findMember(String na);
     
    public List<CFMEMemberModel> getMembers(); 
}
