package com.pwsip.pl.enigma.service;

import com.pwsip.pl.enigma.entity.CoordinateEntity;
import com.pwsip.pl.enigma.payload.CoordinatePayload;
import com.pwsip.pl.enigma.repository.CoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mariusz on 15.10.17.
 */
@Service
public class CoordinateImpl implements Coordinate {

    private CoordinateRepository coordinateRepository;

    @Autowired
    public CoordinateImpl(CoordinateRepository coordinateRepository) {
        this.coordinateRepository = coordinateRepository;
    }

    public void add(CoordinatePayload coordinatePayload){
        CoordinateEntity coordinateEntity = new CoordinateEntity();
        coordinateEntity.setDeviceId(coordinatePayload.getDeviceId());
        coordinateEntity.setLatitiude(coordinatePayload.getLatitiude());
        coordinateEntity.setLongitude(coordinatePayload.getLongitude());
        this.coordinateRepository.save(coordinateEntity);
    }
}
