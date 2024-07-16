package com.json.converter.entity;

public class Units {
    private int unitnumber;
    private boolean available;
    private String modelUuid;


    public int getUnitnumber() {
        return unitnumber;
    }

    public void setUnitnumber(int unitnumber) {
        this.unitnumber = unitnumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getModelUuid() {
        return modelUuid;
    }

    public void setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
    }
}
