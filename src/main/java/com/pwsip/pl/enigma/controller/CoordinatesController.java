package com.pwsip.pl.enigma.controller;

import com.pwsip.pl.enigma.payload.CoordinatePayload;
import com.pwsip.pl.enigma.service.Coordinate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by mariusz on 11.10.17.
 */
@RestController
@RequestMapping(value = "coordinates")
public class CoordinatesController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity addCoordinate(@Valid @RequestBody CoordinatePayload coordinatePayload) {
        rabbitTemplate.convertAndSend("spring-boot-exchange","COORDINATE_ADD", coordinatePayload);
        return new ResponseEntity("OK", HttpStatus.CREATED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionFromSystem(HttpServletRequest req, Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
