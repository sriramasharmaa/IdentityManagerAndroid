package com.dotg.www.identitymanager;

/**
 * Created by kameshwarsheoran on 07/04/15.
 */
public class IdentityListTemplate {
    private int id;
    private String name;


    public IdentityListTemplate(){
        super();
    }

    public IdentityListTemplate(int id, String name) {
        super();
        this.id = id;
        this.name = name;

    }
    public int getId(){
        return id;
    }
    @Override
    public String toString() {
        return  this.name ;
    }
}
