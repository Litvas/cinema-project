package com.asdevelopment.service.impl;

import com.asdevelopment.dao.FilmDAO;
import com.asdevelopment.entity.Film;
import com.asdevelopment.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDAO filmDAO;

    public Set<Film> getAllFilms() {
        List<Film> films = filmDAO.getAllFilms();
        Set<Film>filmSet = new HashSet<>(films.size());
        filmSet.addAll(films);
        return filmSet;
    }

    public void addFilm(Film film) {
        filmDAO.addFilm(film);
    }

    public void deleteFilm(int id) {
        filmDAO.deleteFilm(id);
    }

    @Override
    public Film getOneFilm(int id) {
        return filmDAO.getOneFilm(id);
    }

    @Override
    public void editFilm(Film film) {
        filmDAO.editFilm(film);
    }
}
