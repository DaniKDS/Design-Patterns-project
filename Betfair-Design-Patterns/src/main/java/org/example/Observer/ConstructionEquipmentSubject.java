package org.example.Observer;

public interface ConstructionEquipmentSubject {

    // Metodele pentru înregistrarea, eliminarea și notificarea observatorilor
    void registerObserver(ConstructionEquipmentObserver observer);
    void removeObserver(ConstructionEquipmentObserver observer);
    void notifyObservers(String status);


}
