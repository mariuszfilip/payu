package com.pwsip.pl.enigma.configuration.payu;

import com.pwsip.pl.enigma.configuration.profile.ProdProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by mariusz on 14.10.17.
 */
@Component
@ProdProfile
public class PayuConfigurationProd {

    @Value("${prod.payu.auth.url}")
    private String urlAuth;

    @Value("${prod.payu.auth.grant_type}")
    private String grandType;

    @Value("${prod.payu.auth.clientId}")
    private String clientId;

    @Value("${prod.payu.auth.clientsecret}")
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
