package org.example.Observer;

import java.util.Date;

public class EquipmentMonitor implements ConstructionEquipmentObserver {
    private String notificationThreshold;

    @Override
    public void update(String status) {
        System.out.println("Equipment Monitor: Status updated - " + status);
    }

    @Override
    public void update(String status, long timestamp) {
        System.out.println("Equipment Monitor: Status updated - " + status + " at " + new Date(timestamp));
    }

    @Override
    public void update(String status, String details) {
        System.out.println("Equipment Monitor: Status updated - " + status + " Details: " + details);
    }

    @Override
    public void setNotificationThreshold(String threshold) {
        this.notificationThreshold = threshold;
    }
}
