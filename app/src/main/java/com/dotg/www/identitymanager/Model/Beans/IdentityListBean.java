package com.dotg.www.identitymanager.Model.Beans;

/**
 * Created by kameshwarsheoran on 07/04/15.
 */
public class IdentityListBean {
    private int id;
    private String name;


    public IdentityListBean(){
        super();
    }

    public IdentityListBean(int id, String name) {
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
