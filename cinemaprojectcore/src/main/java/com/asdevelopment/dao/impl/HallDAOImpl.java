package com.asdevelopment.dao.impl;

import com.asdevelopment.dao.HallDAO;
import com.asdevelopment.entity.Hall;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class HallDAOImpl implements HallDAO{

    @Override
    public List<Hall> getAllHalls() {
        return null;
    }
}
