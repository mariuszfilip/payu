package com.pwsip.pl.enigma.rabbitmq.receiver;

import com.pwsip.pl.enigma.payload.CoordinatePayload;
import com.pwsip.pl.enigma.service.Coordinate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by mariusz on 15.10.17.
 */
@Service
public class CoordinateReceiver {


    private Coordinate coordinate;

    @Autowired
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    /*    @RabbitHandler
            @RabbitListener(queues = "COORDINATE_ADD")*/
    public void receiveMessage(CoordinatePayload coordinatePayload) {
        System.out.println("coordinatePayload : "+coordinatePayload.getDeviceId());
        this.coordinate.add(coordinatePayload);
    }
}
