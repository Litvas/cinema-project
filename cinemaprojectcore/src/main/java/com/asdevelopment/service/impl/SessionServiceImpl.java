package com.asdevelopment.service.impl;


import com.asdevelopment.dao.SessionDAO;
import com.asdevelopment.entity.Session;
import com.asdevelopment.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionDAO sessionDAO;

    @Override
    public List<Session> getAllSessions() {
        return sessionDAO.getAllSessions();
    }

    public Set<Session> getSessionForFilm(String sessions) {
        String[] sessionsArray = sessions.split(",");
        int idSession;
        Set<Session> result = new HashSet<>();
        for (int i = 0; i < sessionsArray.length; i++) {
            idSession = Integer.parseInt(sessionsArray[i]);
            result.add(getOneSession(idSession));
        }
        return result;
    }

    @Override
    public void addSession(Session session) {

    }

    @Override
    public void deleteSession(Session session) {

    }

    @Override
    public Session getOneSession(int id) {
        return sessionDAO.getOneSession(id);
    }
}
