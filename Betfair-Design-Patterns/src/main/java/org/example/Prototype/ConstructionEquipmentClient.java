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
}
