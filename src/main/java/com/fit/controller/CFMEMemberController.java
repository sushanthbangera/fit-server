
package com.fit.controller;

import com.fit.dto.CFMEMemberDTO;
import com.fit.dto.CFMEResponseDTO;
import com.fit.service.CFMEMemberService;
import java.util.List;
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
public class CFMEMemberController {
    
   @Autowired 
   private CFMEMemberService memberService;
   
   @RequestMapping(value = "/savemember", method = RequestMethod.POST)
   public ResponseEntity saveMember(@RequestBody CFMEMemberDTO memberDTO) {
       CFMEResponseDTO responseObj = memberService.saveMember(memberDTO);
       HttpHeaders responseHeaders = new HttpHeaders();  	        
       responseHeaders.set("Access-Control-Allow-Origin", "*");
       return new ResponseEntity<>(responseObj, responseHeaders, HttpStatus.OK);
   } 
   
   @RequestMapping(value = "/deletemember", method = RequestMethod.POST)
   public ResponseEntity deleteMember(@RequestBody Integer id) {
       CFMEResponseDTO responseObj = memberService.deleteMember(id);
       HttpHeaders responseHeaders = new HttpHeaders();  	        
       responseHeaders.set("Access-Control-Allow-Origin", "*");
       return new ResponseEntity<>(responseObj, responseHeaders, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/members", method = RequestMethod.GET)
   public ResponseEntity getMembers() {
       List<CFMEMemberDTO> members = memberService.getMembers();
       return new ResponseEntity<>(members, HttpStatus.OK);
   }
   
}
