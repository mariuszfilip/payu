package com.pwsip.pl.enigma.service;

import com.pwsip.pl.enigma.payload.OrderPayload;
import com.pwsip.pl.enigma.payload.OrderResult;

/**
 * Created by mariusz on 14.10.17.
 */
public interface OrderPayu {

    public OrderResult create(OrderPayload order);
}
