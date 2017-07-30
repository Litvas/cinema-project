package com.asdevelopment.service;

import com.asdevelopment.entity.Film;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface FilmService {

    Set<Film> getAllFilms();

    void addFilm(Film film);

    void deleteFilm(int id);

    Film getOneFilm(int id);

    void editFilm(Film film);

}
