package com.asdevelopment.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Component
@Entity
@Table
public class Session {

    @Id
    @Column(name = "id_session", nullable = false)
    private int idSession;

    @Override
    public String toString() {
        return "Session{" +
                "idSession=" + idSession +
                ", startSession=" + startSession +
                ", endSession=" + endSession +
                ", hall=" + hall +
                ", films=" + films +
                '}';
    }

    @Column(name = "start_session")
    private Time startSession;

    @Column(name = "end_session")
    private Time endSession;

    @OneToOne
    @JoinColumn(name = "id_hall")
    private Hall hall;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "sessions")
    private Set<Film> films;

    public Session() {

    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public Time getStartSession() {
        return startSession;
    }

    public void setStartSession(Time startSession) {
        this.startSession = startSession;
    }

    public Time getEndSession() {
        return endSession;
    }

    public void setEndSession(Time endSession) {
        this.endSession = endSession;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
