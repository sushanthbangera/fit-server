/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fit.service;

import com.fit.dao.CFMEMemberDAO;
import com.fit.dto.CFMEMemberDTO;
import com.fit.dto.CFMEResponseDTO;
import com.fit.model.CFMEMemberModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sushanth Bangera
 */
@Service
public class CFMEMemberServiceImpl implements CFMEMemberService {
    
    @Autowired
    private CFMEMemberDAO memberDAO;

    @Override
    @SuppressWarnings("finally")
    public CFMEResponseDTO saveMember(CFMEMemberDTO memberDTO) {
        CFMEResponseDTO mRespObj = null;
        try {
            CFMEMemberModel member = new CFMEMemberModel();
            member.setFirstName(memberDTO.getFirstName());
            member.setLastName(memberDTO.getLastName());
            member.setAge(memberDTO.getAge());
            member.setDateOfBirth(memberDTO.getDateOfBirth());
            member.setContact(memberDTO.getContact());
            member.setEmail(memberDTO.getEmail());
            if (memberDTO.getId() != 0) {
                member.setId(memberDTO.getId());
                memberDAO.updateMember(member);
            } else {
                memberDAO.addMember(member);
            }
            mRespObj = new CFMEResponseDTO(2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return mRespObj;
        }
    }

    @Override
    @SuppressWarnings("finally")
    public CFMEResponseDTO deleteMember(int id) {
        CFMEResponseDTO mRespObj = null;
        try {
            memberDAO.deleteMember(id);
        } catch (Exception e) {
        } finally {
            return mRespObj;
        }
    }

    @Override
    public CFMEMemberDTO findMember(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CFMEMemberDTO findMember(String na) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CFMEMemberDTO> getMembers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
