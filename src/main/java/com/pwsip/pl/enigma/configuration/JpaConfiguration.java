package com.pwsip.pl.enigma.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mariusz on 11.10.17.
 */
@Configuration
@EntityScan({
        "com.pwsip.pl.enigma.entity"
})
public class JpaConfiguration {
}
