package org.example.Prototype;

//
public interface ConstructionEquipmentPrototype {

    //Metoda de clonare
    ConstructionEquipmentPrototype clone();
    String getModel();
    String getCapacity();
    void printDetails();
}
