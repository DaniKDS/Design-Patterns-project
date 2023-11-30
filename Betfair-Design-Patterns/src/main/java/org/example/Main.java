package org.example;

import org.example.Command.Command;
import org.example.Command.CommandInvoker;
import org.example.Command.ConstructionEquipment;
import org.example.Command.StartCommand;
import org.example.Observer.Bulldozer;
import org.example.Observer.EquipmentMonitor;
import org.example.Prototype.BulldozerPrototype;
import org.example.Prototype.ConstructionEquipmentClient;
import org.example.Prototype.ConstructionEquipmentPrototype;
import org.example.Proxy.BulldozerInfoProxy;
import org.example.Proxy.ConstructionEquipmentInfo;

public class Main {
    public static void main(String[] args) {

        // Observer pattern
        Bulldozer bulldozer = new Bulldozer();
        EquipmentMonitor monitor = new EquipmentMonitor();
        bulldozer.registerObserver(monitor);

        bulldozer.setStatus("Working");
        bulldozer.setStatus("Idle");

        // Prototype pattern

        ConstructionEquipmentClient client = new ConstructionEquipmentClient();
        BulldozerPrototype bulldozerPrototype = new BulldozerPrototype("Model-X", "500 HP");

        client.addPrototype("Bulldozer1", bulldozerPrototype);

        // Clonarea unui prototip pentru a crea un nou bulldozer
        ConstructionEquipmentPrototype newBulldozer = client.getClone("Bulldozer1");
        System.out.println(newBulldozer);

        // Utilizarea Proxy pentru a obține informații despre bulldozer
        ConstructionEquipmentInfo bulldozerInfoProxy = new BulldozerInfoProxy("admin");
        System.out.println(bulldozerInfoProxy.getEquipmentInfo());

        ConstructionEquipmentInfo unauthorizedUserProxy = new BulldozerInfoProxy("user");
        System.out.println(unauthorizedUserProxy.getEquipmentInfo());

        // Utilizarea Command pentru a programa și executa comenzi
        ConstructionEquipment excavator = new ConstructionEquipment("Excavator");
        Command startExcavatorCommand = new StartCommand(excavator);

        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(startExcavatorCommand);

        // Programarea și executarea comenzii
        invoker.executeCommand();

    }
}

