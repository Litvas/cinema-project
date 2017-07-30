package com.asdevelopment.dao;

import com.asdevelopment.entity.Film;
import com.asdevelopment.entity.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FilmDAO {

    List<Film> getAllFilms();

    void addFilm(Film film);

    void deleteFilm(int id);

    Film getOneFilm(int id);

    void editFilm(Film film);


}
