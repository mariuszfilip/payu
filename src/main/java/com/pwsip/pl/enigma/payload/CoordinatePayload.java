package com.pwsip.pl.enigma.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by mariusz on 15.10.17.
 */
public class CoordinatePayload implements Serializable{

    /*

        {'deviceId':'12345', 'latitiude': 505430, 'longitude': 14234
     */

    @JsonProperty(value = "deviceId", required = true)
    @NotEmpty
    private String deviceId;

    @JsonProperty(value = "latitiude", required = true)
    @NotEmpty
    private String latitiude;

    @JsonProperty(value = "longitude", required = true)
    @NotEmpty
    private String longitude;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
