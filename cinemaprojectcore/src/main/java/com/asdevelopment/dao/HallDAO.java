package com.asdevelopment.dao;


import com.asdevelopment.entity.Hall;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface HallDAO {

    List<Hall> getAllHalls();

}
