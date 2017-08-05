
package com.fit.controller;

import com.fit.dao.CFMEMemberDAO;
import com.fit.dto.CFMEMemberDTO;
import com.fit.model.CFMEMemberModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sushanth Bangera
 */
public class CFMEMemberController {
    
   private CFMEMemberDAO memberDAO;
   
   @RequestMapping(value = "/addmember", method = RequestMethod.POST)
   public ResponseEntity addMember(@RequestBody CFMEMemberDTO memberDTO) {
       CFMEMemberModel member = new CFMEMemberModel();
       member.setFirstName(memberDTO.getFirstName());
       member.setLastName(memberDTO.getLastName());
       member.setAge(memberDTO.getAge());
       member.setDateOfBirth(memberDTO.getDateOfBirth());
       member.setContact(memberDTO.getContact());
       member.setEmail(memberDTO.getEmail());
       memberDAO.saveMember(member);
       return new ResponseEntity<>("Success", HttpStatus.OK);
   } 
   
   
   
    
}
