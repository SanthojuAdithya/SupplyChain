package com.wecp.progressive.entity;

public class Warehouse implements Comparable<Warehouse> {
    int warehouseId;
    String warehouseName;
    String location;
    int capacity;
    public Warehouse() {
    }
    public Warehouse(int warehouseId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public int compareTo(Warehouse o) {
        return Double.compare(o.getCapacity(), this.getCapacity());
    }

    



}