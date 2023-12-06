package org.example.Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bulldozer implements ConstructionEquipmentSubject {
    private final List<ConstructionEquipmentObserver> observers = new ArrayList<>();
    private final List<String> stateHistory = new ArrayList<>();

    public void setStatus(String status) {
        notifyObservers(status);
        saveStateToHistory(status);
    }

    private void saveStateToHistory(String status) {
        stateHistory.add(status);
    }

    public List<String> getStateHistory() {
        return Collections.unmodifiableList(stateHistory);
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
