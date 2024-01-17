package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    /*private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
        if (value.equals("")) this.value = "Data is not available";
    }*/

    public PositionType(String value) {
        super(value);
        //if (value.equals("")) this.value = "Data is not available";
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

   /* @Override
    public String toString() {
        return value;
    }*/

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PositionType)) return false;
        PositionType position = (PositionType) obj;
        return getId() == position.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }*/

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

    /*public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }*/

}
