package com.pwsip.pl.enigma.configuration.payu;

import com.pwsip.pl.enigma.configuration.profile.DevProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by mariusz on 14.10.17.
 */
@Component
@DevProfile
public class PayuConfigurationDev implements PayuConfiguration{

    @Value("${dev.payu.auth.url}")
    private String urlAuth;

    @Value("${dev.payu.auth.grant_type}")
    private String grandType;

    @Value("${dev.payu.auth.clientId}")
    private String clientId;

    @Value("${dev.payu.auth.clientsecret}")
    private String clientSecret;

    public String getUrlAuth() {
        return urlAuth;
    }

    public void setUrlAuth(String urlAuth) {
        this.urlAuth = urlAuth;
    }

    public String getGrandType() {
        return grandType;
    }

    public void setGrandType(String grandType) {
        this.grandType = grandType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
