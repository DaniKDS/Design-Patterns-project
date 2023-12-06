package org.example.Observer;

import java.util.Date;

public interface ConstructionEquipmentObserver {
    void update(String status);
    void update(String status, long timestamp);
    void update(String status, String details);
    void setNotificationThreshold(String threshold);
}
