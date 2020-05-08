package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField{
    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        super(value);
    }

}
