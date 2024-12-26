package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService  {

    private static List<Warehouse> warehouseList;
    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
        return warehouse.getCapacity();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // Collections.sort(warehouseList);
        // return warehouseList;
        warehouseList.sort(Comparator.comparingInt(Warehouse::getCapacity));
        return warehouseList;
    }

   @Override 
     public void emptyArrayList() {
        warehouseList=new ArrayList<>();
    }
}