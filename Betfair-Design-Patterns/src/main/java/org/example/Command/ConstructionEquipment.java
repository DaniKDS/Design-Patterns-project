package org.example.Command;

// Receiver (ConstructionEquipment)
public class ConstructionEquipment {
    private String name;

    public ConstructionEquipment(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + " has started.");
    }
}
