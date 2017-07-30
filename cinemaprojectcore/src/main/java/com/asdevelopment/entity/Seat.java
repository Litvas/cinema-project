package com.asdevelopment.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table
public class Seat {

    @Id
    @Column(name="id_seat")
    private int idSeat;

    @Column(name = "row")
    private int row;

    @Column(name="number_of_seat")
    private int numberOfSeat;

    @Column(name="availability")
    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "id_hall")
    private Hall hall;

    public Seat() {
    }

    public int getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(int idSeat) {
        this.idSeat = idSeat;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
