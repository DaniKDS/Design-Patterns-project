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
import org.example.Proxy.*;

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

        // Display all prototypes
        client.displayAllPrototypes();

        // Clone a prototype to create a new bulldozer
        ConstructionEquipmentPrototype newBulldozer = client.getClone("Bulldozer1");
        System.out.println("Cloned Bulldozer:");
        newBulldozer.printDetails();

        // Modify the cloned bulldozer
        ((BulldozerPrototype) newBulldozer).setModel("Model-Y");
        ((BulldozerPrototype) newBulldozer).setCapacity("600 HP");
        System.out.println("Modified Cloned Bulldozer:");
        newBulldozer.printDetails();

        // Remove a prototype
        client.removePrototype("Bulldozer1");
        // Display remaining prototypes
        client.displayAllPrototypes();

        // Utilizarea Proxy pentru a obține informații despre bulldozer
        AuthorizedConstructionEquipmentInfo adminBulldozerInfoProxy = new EnhancedBulldozerInfoProxy();
        adminBulldozerInfoProxy.setAuthorizedUser("admin");
        System.out.println(adminBulldozerInfoProxy.getEquipmentInfo());

        AuthorizedConstructionEquipmentInfo userBulldozerInfoProxy = new EnhancedBulldozerInfoProxy();
        userBulldozerInfoProxy.setAuthorizedUser("user");
        System.out.println(userBulldozerInfoProxy.getEquipmentInfo());

        // Utilizare serviciu de gestionare a utilizatorilor pentru verificarea autorizației
        UserService userService = new UserService();
        boolean isAdmin = userService.checkAuthorization("admin", "admin");
        System.out.println("Is admin? " + isAdmin);

        // Utilizarea Command pentru a programa și executa comenzi
        ConstructionEquipment excavator = new ConstructionEquipment("Excavator");
        Command startExcavatorCommand = new StartCommand(excavator);

        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(startExcavatorCommand);

        // Programarea și executarea comenzii
        invoker.executeCommand();

    }
}

