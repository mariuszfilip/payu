package com.pwsip.pl.enigma.domain;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by mariusz on 15.10.17.
 */
public class TreeBranch {
    BigDecimal length;
    ArrayList<TreeBranch> treeBranches;

    {
        this.treeBranches = new ArrayList<>();
    }

    public TreeBranch(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void addBranch(TreeBranch treeBranch){
        this.treeBranches.add(treeBranch);
    }
}
