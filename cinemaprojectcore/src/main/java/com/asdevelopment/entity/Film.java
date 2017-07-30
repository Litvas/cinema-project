package com.asdevelopment.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Component
@Entity
@Table
public class Film {

    @Id
    @GeneratedValue
    @Column(name = "id_film", nullable = false)
    private int idFilm;

    @Column(name = "title_of_film")
    private String titleOfFilm;

    @Column(name = "duration_of_film")
    private int durationOfFilm;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "session_film", joinColumns = {
            @JoinColumn(name = "id_film")
    }, inverseJoinColumns = {@JoinColumn(name = "id_session")})
    private Set<Session> sessions;

    @Column(name = "date_of_start_showing")
    private Date dateOfStartShowing;

    @Column(name = "date_of_end_showing")
    private Date dateOfEndShowing;

    public Film() {
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getTitleOfFilm() {
        return titleOfFilm;
    }

    public void setTitleOfFilm(String titleOfFilm) {
        this.titleOfFilm = titleOfFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getDurationOfFilm() {
        return durationOfFilm;
    }

    public void setDurationOfFilm(int durationOfFilm) {
        this.durationOfFilm = durationOfFilm;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public Date getDateOfStartShowing() {
        return dateOfStartShowing;
    }

    public void setDateOfStartShowing(Date dateOfStartShowing) {
        this.dateOfStartShowing = dateOfStartShowing;
    }

    public Date getDateOfEndShowing() {
        return dateOfEndShowing;
    }

    public void setDateOfEndShowing(Date dateOfEndShowing) {
        this.dateOfEndShowing = dateOfEndShowing;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", titleOfFilm='" + titleOfFilm + '\'' +
                ", durationOfFilm=" + durationOfFilm +
                ", sessions=" + sessions +
                ", dateOfStartShowing=" + dateOfStartShowing +
                ", dateOfEndShowing=" + dateOfEndShowing +
                '}';
    }
}
