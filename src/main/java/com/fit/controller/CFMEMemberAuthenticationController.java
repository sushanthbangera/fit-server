
package com.fit.controller;

import com.fit.dto.CFMEMemberAuthenticationDTO;
import com.fit.dto.CFMEResponseDTO;
import com.fit.service.CFMEMemberAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sushanth Bangera
 */
@Controller
public class CFMEMemberAuthenticationController {
    
    @Autowired
    CFMEMemberAuthenticationService memberAuthenticateService;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity authenticateMember(@RequestBody CFMEMemberAuthenticationDTO memberAuthDTO) {
        CFMEResponseDTO responseObj = memberAuthenticateService.authenticateMember(memberAuthDTO);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(responseObj, responseHeaders, HttpStatus.OK);
    }
    
    
    
}
