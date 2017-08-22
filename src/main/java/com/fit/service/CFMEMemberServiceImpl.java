
package com.fit.service;

import com.fit.dao.CFMEMemberDAO;
import com.fit.dto.CFMEMemberDTO;
import com.fit.dto.CFMEResponseDTO;
import com.fit.model.CFMEMemberModel;
import java.util.ArrayList;
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
            createMemberDTO(member, memberDTO);
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
    
    private void createMemberDTO(CFMEMemberModel member, CFMEMemberDTO memberDTO) {
        member.setFirstName(memberDTO.getFirstName());
        member.setLastName(memberDTO.getLastName());
        member.setAge(memberDTO.getAge());
        member.setDateOfBirth(memberDTO.getDateOfBirth());
        member.setContact(memberDTO.getContact());
        member.setEmail(memberDTO.getEmail());
    }

    @Override
    @SuppressWarnings("finally")
    public CFMEResponseDTO deleteMember(int id) {
        CFMEResponseDTO mRespObj = null;
        try {
            memberDAO.deleteMember(id);
            mRespObj = new CFMEResponseDTO(2);
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
        List<CFMEMemberDTO> members = new ArrayList<>();
        try {
            List<CFMEMemberModel> memberModelList = memberDAO.getMembers();

            memberModelList.stream().map((member) -> new CFMEMemberDTO(member.getId(), member.getFirstName(), member.getLastName(),
                    member.getAge(), member.getEmail(), member.getDateOfBirth(), member.getAddress())).forEach((memberObj) -> {
                        members.add(memberObj);
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return members;
    }
    
}
