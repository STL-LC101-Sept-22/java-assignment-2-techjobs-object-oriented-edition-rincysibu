package org.launchcode.techjobs.oo;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        if(value.isBlank()){
            value= "Data not available";
        }
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
       return value;
    }

    public int getId() {
        return id;
    }
}
