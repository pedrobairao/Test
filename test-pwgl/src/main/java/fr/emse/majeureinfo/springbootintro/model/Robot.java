package fr.emse.majeureinfo.springbootintro.model;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Robot {

    @Id
    @GeneratedValue //Its better to have a unique generated value, shall erase the setId as well
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Sensor sensor;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Actuator actuator;

    //Must have an empty constructor
    public Robot(){
    }

    public Robot(Sensor sensor, Actuator actuator) {
        this.sensor = sensor;
        this.actuator = actuator;
    }


    public Long getId() {
        return this.id;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Actuator getActuator() {
        return actuator;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    public void switchSensor() {
        if (getSensor().getStatus() == Status.ON){
            getSensor().setStatus(Status.OFF);
        }
        else {
            getSensor().setStatus(Status.ON);
        }
    }


    public void switchActuator() {
        if (getActuator().getStatus() == Status.ON) {
            getActuator().setStatus(Status.OFF);
        }
        else {
            getActuator().setStatus(Status.ON);
        }
    }



}
