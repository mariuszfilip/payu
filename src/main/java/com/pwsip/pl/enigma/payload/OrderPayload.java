package com.pwsip.pl.enigma.payload;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by mariusz on 14.10.17.
 */
public class OrderPayload {

     private String notifyUrl;
     private String customerIp;
     private BigInteger merchantPosId;
     private String description;
     private String currencyCode;
     private BigInteger totalAmount;
     private BuyerPayload buyerPayload;
     private ArrayList<ProductPayload> products;

     public OrderPayload(){
          this.products = new ArrayList<>();
     }

     public String getNotifyUrl() {
          return notifyUrl;
     }

     public void setNotifyUrl(String notifyUrl) {
          this.notifyUrl = notifyUrl;
     }

     public String getCustomerIp() {
          return customerIp;
     }

     public void setCustomerIp(String customerIp) {
          this.customerIp = customerIp;
     }

     public BigInteger getMerchantPosId() {
          return merchantPosId;
     }

     public void setMerchantPosId(BigInteger merchantPosId) {
          this.merchantPosId = merchantPosId;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getCurrencyCode() {
          return currencyCode;
     }

     public void setCurrencyCode(String currencyCode) {
          this.currencyCode = currencyCode;
     }

     public BigInteger getTotalAmount() {
          return totalAmount;
     }

     public void setTotalAmount(BigInteger totalAmount) {
          this.totalAmount = totalAmount;
     }

     public BuyerPayload getBuyerPayload() {
          return buyerPayload;
     }

     public void setBuyerPayload(BuyerPayload buyerPayload) {
          this.buyerPayload = buyerPayload;
     }

     public ArrayList<ProductPayload> getProducts() {
          return products;
     }

     public void addProduct(ProductPayload productPayload) {
          this.products.add(productPayload);
     }
}
