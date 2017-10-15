package com.pwsip.pl.enigma.service;

import com.pwsip.pl.enigma.payload.OrderPayload;
import com.pwsip.pl.enigma.payload.OrderResult;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mariusz on 14.10.17.
 */
@Service
public class OrderPayuImpl implements OrderPayu{

    private RestTemplate restTemplate;

    private AuthPayu authPayu;

    public OrderPayuImpl(RestTemplate restTemplate, AuthPayu authPayu) {
        this.restTemplate = restTemplate;
        this.authPayu = authPayu;
    }

    @Override
    public OrderResult create(OrderPayload order) {
        authPayu.autorize();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer "+authPayu.getToken());
        headers.add("Content-Type", "application/json");

        HttpEntity requestAuth = new HttpEntity<OrderPayload>(order,headers);
        ResponseEntity<OrderResult> orderPayload = restTemplate.postForEntity("https://secure.payu.com/api/v2_1/orders", requestAuth, OrderResult.class);
        return orderPayload.getBody();
    }
}
