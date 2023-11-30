package org.example.Proxy;
class BulldozerInfo implements ConstructionEquipmentInfo {
    private final String model;
    private final String capacity;

    public BulldozerInfo(String model, String capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String getEquipmentInfo() {
        return "Bulldozer - Model: " + model + ", Capacity: " + capacity;
    }
}
