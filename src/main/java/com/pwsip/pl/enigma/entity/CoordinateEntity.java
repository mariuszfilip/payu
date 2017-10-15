package com.pwsip.pl.enigma.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mariusz on 15.10.17.
 */
@Entity
@Table(name = "coordinates")
public class CoordinateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deviceId")
    private String deviceId;

    @Column(name = "latitiude")
    private String latitiude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "date_add",nullable = false)
    private Date dateAdd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    @PrePersist
    void prePersist() {
        this.dateAdd = new Date();
    }
}
