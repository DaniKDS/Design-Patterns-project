package org.example.Prototype;

public class BulldozerPrototype implements ConstructionEquipmentPrototype {
    private String model;
    private String capacity;

    public BulldozerPrototype(String model, String capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public ConstructionEquipmentPrototype clone() {
        return new BulldozerPrototype(model, capacity);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public void printDetails() {
        System.out.println("Bulldozer - Model: " + model + ", Capacity: " + capacity);
    }
}
