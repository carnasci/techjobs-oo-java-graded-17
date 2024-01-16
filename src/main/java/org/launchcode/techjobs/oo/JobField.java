package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public String value;
    public int id;
    public static int nextId = 1;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
