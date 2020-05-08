package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{
    public Location() {
        id = nextId;
        nextId++;
    }

    public Location(String value){
        super(value);
    }
}
