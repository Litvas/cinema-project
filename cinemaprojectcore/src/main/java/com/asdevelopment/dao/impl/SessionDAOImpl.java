package com.asdevelopment.dao.impl;


import com.asdevelopment.dao.SessionDAO;
import com.asdevelopment.entity.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SessionDAOImpl implements SessionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Session> getAllSessions() {
        return (List<Session>) sessionFactory.getCurrentSession().createCriteria(Session.class).list();
    }

    @Override
    public Session getOneSession(int idSession) {
        return sessionFactory.getCurrentSession().load(Session.class, idSession);
    }

}
