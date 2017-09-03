
package com.fit.service;

import com.fit.dto.CFMEMemberAuthenticationDTO;
import com.fit.dto.CFMEResponseDTO;

/**
 *
 * @author Sushanth Bangera
 */
public interface CFMEMemberAuthenticationService {
    
    public CFMEResponseDTO authenticateMember(CFMEMemberAuthenticationDTO memberAuthDTO);
}
