package com.asdevelopment.service;


import com.asdevelopment.entity.Session;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface SessionService {

    List<Session> getAllSessions();

    void addSession(Session session);

    void deleteSession(Session session);

    Session getOneSession(int id);

    Set<Session> getSessionForFilm(String sessions);
}
