package org.example.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ConstructionEquipmentClient {
    private final Map<String, ConstructionEquipmentPrototype> prototypeMap = new HashMap<>();

    public void addPrototype(String key, ConstructionEquipmentPrototype prototype) {
        prototypeMap.put(key, prototype);
    }

    public ConstructionEquipmentPrototype getClone(String key) {
        return prototypeMap.get(key).clone();
    }

    // Display details of all prototypes
    public void displayAllPrototypes() {
        System.out.println("All Construction Equipment Prototypes:");
        for (Map.Entry<String, ConstructionEquipmentPrototype> entry : prototypeMap.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            entry.getValue().printDetails();
        }
    }

    // Remove a prototype from the map
    public void removePrototype(String key) {
        prototypeMap.remove(key);
    }
}