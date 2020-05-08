package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{
    public PositionType(){
        this.id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        super(value);
    }
}
