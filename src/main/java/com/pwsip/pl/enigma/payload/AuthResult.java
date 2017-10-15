package com.pwsip.pl.enigma.payload;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by mariusz on 11.10.17.
 */
public class AuthResult implements Serializable{
    private String access_token;
    private String token_type;
    private BigInteger expires_in;
    private String grant_type;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public BigInteger getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(BigInteger expires_in) {
        this.expires_in = expires_in;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
