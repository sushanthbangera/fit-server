
package com.fit.dao;

import com.fit.model.CFMEMemberModel;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sushanth Bangera
 */
@Repository
@Transactional
public class CFMEMemberDAOImpl implements CFMEMemberDAO {

    private SessionFactory sessionFactory;
    
    @Override
    public void saveMember(CFMEMemberModel member) {
       getSession().save(member);
    }

    @Override
    public CFMEMemberModel findMember(int id) {
        return null;   
    }

    @Override
    public CFMEMemberModel findMember(String na) {
        return null;
    }

    @Override
    public List<CFMEMemberModel> getMembers() {
        return null;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
