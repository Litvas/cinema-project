package com.asdevelopment.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table
public class Ticket {

    @Id
    private int idTicket;

    @Column(name="price")
    private int price;

    @OneToOne
    @JoinColumn(name="id_hall")
    private Hall hall;

    @OneToOne
    @JoinColumn(name="id_seat")
    private Seat seat;

    @OneToOne
    @JoinColumn(name="id_session")
    private Session session;

    public Ticket() {
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
