package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer implements ConstructionEquipmentSubject {
    private final List<ConstructionEquipmentObserver> observers = new ArrayList<>();

    public void setStatus(String status) {
        notifyObservers(status);
    }

    @Override
    public void registerObserver(ConstructionEquipmentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ConstructionEquipmentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        for (ConstructionEquipmentObserver observer : observers) {
            observer.update(status);
        }
    }
}