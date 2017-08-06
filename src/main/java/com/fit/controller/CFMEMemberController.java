
package com.fit.controller;

import com.fit.constants.CFMEMessageConstants;
import com.fit.dao.CFMEMemberDAO;
import com.fit.dto.CFMEMemberDTO;
import com.fit.model.CFMEMemberModel;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CFMEMemberController {
    
   private CFMEMemberDAO memberDAO;
   
   @RequestMapping(value = "/savemember", method = RequestMethod.POST)
   public ResponseEntity addMember(@RequestBody CFMEMemberDTO memberDTO) {
       CFMEMemberModel member = new CFMEMemberModel();
       member.setFirstName(memberDTO.getFirstName());
       member.setLastName(memberDTO.getLastName());
       member.setAge(memberDTO.getAge());
       member.setDateOfBirth(memberDTO.getDateOfBirth());
       member.setContact(memberDTO.getContact());
       member.setEmail(memberDTO.getEmail());
       if(memberDTO.getId() != 0) {
           member.setId(memberDTO.getId());
           memberDAO.updateMember(member);
       } else {
           memberDAO.addMember(member);
       }
       return new ResponseEntity<>(CFMEMessageConstants.SAVED_SUCCESSFULLY, HttpStatus.OK);
   } 
   
   @RequestMapping(value = "/deletemember", method = RequestMethod.POST)
   public ResponseEntity deleteMember(@RequestBody Integer id) {
       memberDAO.deleteMember(id);
       return new ResponseEntity<>(CFMEMessageConstants.DELETED_SUCCESSFULLY, HttpStatus.OK);
   }
   
   @Autowired
   public void setCFMEMemberDAO(CFMEMemberDAO memberDAO) {
       this.memberDAO = memberDAO;
   }
   
   
}
