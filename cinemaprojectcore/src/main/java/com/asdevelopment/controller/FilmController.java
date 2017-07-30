package com.asdevelopment.controller;

import com.asdevelopment.entity.Film;
import com.asdevelopment.service.FilmService;
import com.asdevelopment.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("cinema")
@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private SessionService sessionService;


    @RequestMapping(value = "films", method = RequestMethod.GET)
    public String viewAllFilms(Model model) {
        model.addAttribute("listFilms", filmService.getAllFilms());
        return "film/allfilms";
    }

    @RequestMapping(value = "/addnewfilm", method = RequestMethod.POST)
    public String addFilm(@ModelAttribute("film") Film film, BindingResult result,
                          @RequestParam("sessions") String sessions
    ) {
        film.setSessions(sessionService.getSessionForFilm(sessions));
        filmService.addFilm(film);
        return "redirect:/cinema/films";
    }

    @RequestMapping(value = "addfilm", method = RequestMethod.GET)
    public ModelAndView addNewFilm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("film/addfilm");
        modelAndView.addObject("sessionList", sessionService.getAllSessions());
        modelAndView.addObject("film", new Film());
        return modelAndView;
    }

    @RequestMapping(value = "updatefilm/{id}", method = RequestMethod.GET)
    public ModelAndView updateFilm(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("film/updatefilm");
        modelAndView.addObject("sessionList", sessionService.getAllSessions());
        modelAndView.addObject("film", filmService.getOneFilm(id));
        return modelAndView;
    }

    @RequestMapping(value = "/updatefilm")
    public String updateFilm(@ModelAttribute("film") Film film, BindingResult result,
                             @RequestParam("sessions") String sessions
    ) {
        film.setSessions(sessionService.getSessionForFilm(sessions));
        filmService.editFilm(film);
        return "redirect:/cinema/films";
    }

    @RequestMapping(value = "deletefilm/{id}")
    public String deleteFilm(@PathVariable("id") int id) {
        filmService.deleteFilm(id);
        return "redirect:/cinema/films";
    }
}
