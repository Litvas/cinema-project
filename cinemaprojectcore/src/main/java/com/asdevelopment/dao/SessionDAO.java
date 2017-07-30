package com.asdevelopment.dao;


import com.asdevelopment.entity.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface SessionDAO {

    List<Session>getAllSessions();

    Session getOneSession(int idSession);

}
