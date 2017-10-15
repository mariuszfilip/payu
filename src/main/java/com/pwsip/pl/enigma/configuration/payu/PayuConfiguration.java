package com.pwsip.pl.enigma.configuration.payu;

/**
 * Created by mariusz on 14.10.17.
 */
public interface PayuConfiguration {
    public String getUrlAuth();

    public void setUrlAuth(String urlAuth);

    public String getGrandType();

    public void setGrandType(String grandType);

    public String getClientId();

    public void setClientId(String clientId);

    public String getClientSecret();

    public void setClientSecret(String clientSecret);
}
