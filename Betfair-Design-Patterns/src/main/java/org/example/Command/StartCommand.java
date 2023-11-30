package org.example.Command;

// Concrete Command (StartCommand)
public class StartCommand implements Command {
    private ConstructionEquipment equipment;

    public StartCommand(ConstructionEquipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void execute() {
        equipment.start();
    }
}
