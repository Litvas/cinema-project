package com.asdevelopment.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
@Table
public class Hall {

    @Id
    @Column(name = "id_hall")
    private int idHall;

    @Column(name = "name_of_hall")
    private String nameOfHall;

    @OneToMany
    private List<Seat> seats;

    @Column(name="status")
    private String status;

    public Hall() {
            }

    public int getId() {
        return idHall;
    }

    public void setId(int id) {
        this.idHall = idHall;
    }

    public String getNaneOfHall() {
        return nameOfHall;
    }

    public void setNaneOfHall(String naneOfHall) {
        this.nameOfHall = naneOfHall;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
