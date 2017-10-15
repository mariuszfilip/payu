package com.pwsip.pl.enigma.domain;

import java.util.ArrayList;

/**
 * Created by mariusz on 11.10.17.
 */
public abstract class Tree {
    protected TreeTrunk treeTrunk;

    protected ArrayList<TreeBranch> treeBranches;

    {
        this.treeBranches = new ArrayList<>();
    }

    public Tree(TreeTrunk treeTrunk) {
        this.treeTrunk = treeTrunk;
    }

    public abstract void growUp();

    public void addBranch(TreeBranch treeBranch){
        this.treeBranches.add(treeBranch);
    }


}
