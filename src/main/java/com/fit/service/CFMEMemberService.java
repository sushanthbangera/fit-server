/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fit.service;

import com.fit.dao.CFMEMemberDAO;
import com.fit.dto.CFMEMemberDTO;
import com.fit.model.CFMEMemberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sushanth Bangera
 */
@Service
public class CFMEMemberService {
    
    @Autowired
    private CFMEMemberDAO memberDAO;
    
    public void saveMember(CFMEMemberDTO memberDTO) {
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
    }
}
