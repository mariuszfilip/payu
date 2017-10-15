package com.pwsip.pl.enigma.payload;

/**
 * Created by mariusz on 14.10.17.
 */
public class OrderResult {
    private String redirectUri;
    private String orderId;
    private String extOrderId;

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }
}
