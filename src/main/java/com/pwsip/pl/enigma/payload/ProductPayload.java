package com.pwsip.pl.enigma.payload;

import java.math.BigInteger;

/**
 * Created by mariusz on 14.10.17.
 */
public class ProductPayload {
    private String name;
    private BigInteger unitPrice;
    private BigInteger quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigInteger unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }
}
