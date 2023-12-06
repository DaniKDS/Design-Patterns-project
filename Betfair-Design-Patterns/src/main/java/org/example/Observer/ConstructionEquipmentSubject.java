package org.example.Observer;

public interface ConstructionEquipmentSubject {
    void registerObserver(ConstructionEquipmentObserver observer);
    // Metoda de înregistrare a observatorilor
    void removeObserver(ConstructionEquipmentObserver observer);
    // Metoda de ștergere a observatorilor
    void notifyObservers(String status);
    // Metoda de notificare a observatorilor
}
