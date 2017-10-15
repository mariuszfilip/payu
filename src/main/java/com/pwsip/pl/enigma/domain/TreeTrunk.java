package com.pwsip.pl.enigma.domain;

import java.math.BigDecimal;

/**
 * Created by mariusz on 15.10.17.
 */
public class TreeTrunk {
    private BigDecimal diameter;

    public TreeTrunk(BigDecimal diameter) {
        this.diameter = diameter;
    }

    public BigDecimal getDiameter() {
        return diameter;
    }

}
