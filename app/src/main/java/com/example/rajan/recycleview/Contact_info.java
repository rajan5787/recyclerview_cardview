package com.example.rajan.recycleview;

/**
 * Created by Rajan on 2/20/2016.
 */
public class Contact_info {

    protected String name;
    protected String id;
    protected String number;
    protected static final String NAME_PREFIX = "Name_";
    protected static final String SURNAME_PREFIX = "Surname_";
    protected static final String EMAIL_PREFIX = "email_";

    public Contact_info(String name,String id, String number)
    {
        this.name=name;
        this.id=id;
        this.number=number;
    }
}
