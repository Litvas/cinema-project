package com.asdevelopment.dao.impl;

import com.asdevelopment.dao.FilmDAO;
import com.asdevelopment.entity.Film;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class FilmDAOImpl implements FilmDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Film> getAllFilms() {
        return (List<Film>) sessionFactory.getCurrentSession().createCriteria(Film.class).list();
    }

    public void addFilm(Film film) {
        sessionFactory.getCurrentSession().save(film);
    }

    public void deleteFilm(int id) {
        sessionFactory.getCurrentSession().delete(getOneFilm(id));
    }

    @Override
    public Film getOneFilm(int id) {
        return sessionFactory.getCurrentSession().get(Film.class, id);
    }

    @Override
    public void editFilm(Film film) {
        sessionFactory.getCurrentSession().update(film);
    }
}
