package com.pwsip.pl.enigma.service;

import com.pwsip.pl.enigma.configuration.payu.PayuConfiguration;
import com.pwsip.pl.enigma.payload.AuthResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mariusz on 11.10.17.
 */

@Service
public class AuthPayuImpl implements AuthPayu {


    private PayuConfiguration payuConfiguration;

    private RestTemplate restTemplate;

    private AuthResult authResult;

    @Autowired
    public AuthPayuImpl(PayuConfiguration payuConfiguration, RestTemplate restTemplate) {
        this.payuConfiguration = payuConfiguration;
        this.restTemplate = restTemplate;
    }

    public Boolean checkIsTokenExpired() {
        //Implement checkIsTokenExpired
        //Implement refresh token
        return false;
    }

    public void autorize() {
        String url = prepareUrlAuth();

        HttpEntity request = new HttpEntity<String>("");
        ResponseEntity<AuthResult> authPayload = this.restTemplate.postForEntity(url, request, AuthResult.class);

        this.authResult = authPayload.getBody();

    }

    private String prepareUrlAuth() {
        return new StringBuilder(this.payuConfiguration.getUrlAuth()).
                append("?grant_type=").append(this.payuConfiguration.getGrandType()).
                append("&client_id=").append(this.payuConfiguration.getClientId()).append("&client_secret=").append(this.payuConfiguration.getClientSecret()).
                toString();
    }

    public String getToken() {
        return this.authResult.getAccess_token();
    }

}
