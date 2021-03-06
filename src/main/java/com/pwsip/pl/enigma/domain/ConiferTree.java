package com.pwsip.pl.enigma.domain;

import java.math.BigDecimal;

/**
 * Created by mariusz on 11.10.17.
 */
public class ConiferTree extends Tree {

    public ConiferTree(TreeTrunk treeTrunk) {
        super(treeTrunk);
    }

    @Override
    public void growUp() {
        this.treeTrunk = new TreeTrunk(this.treeTrunk.getDiameter().add(new BigDecimal(0.1)));
    }
}
