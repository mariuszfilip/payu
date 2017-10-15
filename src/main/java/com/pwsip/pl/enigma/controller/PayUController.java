package com.pwsip.pl.enigma.controller;

import com.pwsip.pl.enigma.payload.*;
import com.pwsip.pl.enigma.service.AuthPayu;
import com.pwsip.pl.enigma.service.OrderPayu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.Base64;


/**
 * Created by mariusz on 11.10.17.
 */

@RestController
@RequestMapping(value = "payu")
public class PayUController {

    @Autowired
    private OrderPayu orderPayu;

    @RequestMapping(value = "createorder",method = RequestMethod.GET)
    public ResponseEntity create() {
        try{
            OrderPayload order = new OrderPayload();
            order.setNotifyUrl("https://your.eshop.com/notify");
            order.setCustomerIp("127.0.0.1");
            order.setMerchantPosId(new BigInteger(String.valueOf(145227)));
            order.setDescription("RTV market");
            order.setCurrencyCode("PLN");
            order.setTotalAmount(new BigInteger(String.valueOf(15000)));
            BuyerPayload buyer = new BuyerPayload();
            buyer.setEmail("john.doe@example.com");
            buyer.setPhone("654111654");
            buyer.setFirstName("John");
            buyer.setLastName("Doe");

            order.setBuyerPayload(buyer);

            ProductPayload firstProduct = new ProductPayload();
            firstProduct.setName("Wireless Mouse for Laptop");
            firstProduct.setQuantity(new BigInteger(String.valueOf(1)));
            firstProduct.setUnitPrice(new BigInteger(String.valueOf(15000)));
            order.addProduct(firstProduct);
            order.addProduct(firstProduct);
            order.addProduct(firstProduct);

            OrderResult orderResult = orderPayu.create(order);
            return new ResponseEntity(orderResult,HttpStatus.CREATED);

        }catch (RestClientResponseException r){
            return new ResponseEntity(r.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionFromSystem(HttpServletRequest req, Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
