package fr.emse.majeureinfo.springbootintro.model;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Actuator {

    @Id
    @GeneratedValue //Its better to have a unique generated value, shall erase the setId as well
    private Long id;

    @Column(nullable = false)
    private Integer speed;

    @Enumerated(EnumType.STRING)
    private Status status;

    //Must have an empty constructor
    public Actuator(){
    }

    public Actuator(Integer speed, Status status) {
        this.speed = speed;
        this.status = status;
    }


    public Long getId() { return this.id; }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

