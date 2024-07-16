package com.json.converter.entity;

import java.util.List;

public class Floor {
    private List<Units> units;
    private int floornumber;

    public int getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }

    public List<Units> getUnits() {
        return units;
    }

    public void setUnits(List<Units> units) {
        this.units = units;
    }
}
