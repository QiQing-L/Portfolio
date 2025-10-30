package com.pluralsight;

import com.pluralsight.finance.IValuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();

    }

    public void add (IValuable asset){
            this.assets.add(asset);
    }

    public double getValue(){


    }

    public double getMostValue(){


    }

    public double getLeastValue(){


    }








}
