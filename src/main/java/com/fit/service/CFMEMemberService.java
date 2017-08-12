
package com.fit.service;

import com.fit.dto.CFMEMemberDTO;
import com.fit.dto.CFMEResponseDTO;
import java.util.List;

/**
 *
 * @author Sushanth Bangera
 */
public interface CFMEMemberService {
    
    public CFMEResponseDTO saveMember(CFMEMemberDTO memberDTO);
    
    public CFMEResponseDTO deleteMember(int id);
    
    public CFMEMemberDTO findMember(int id);
    
    public CFMEMemberDTO findMember(String na);
     
    public List<CFMEMemberDTO> getMembers(); 
}
