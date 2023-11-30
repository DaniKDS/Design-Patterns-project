package org.example.Observer;

public class EquipmentMonitor implements ConstructionEquipmentObserver {
    @Override
    public void update(String status) {
        System.out.println("Equipment Monitor: Status updated - " + status);
    }
}