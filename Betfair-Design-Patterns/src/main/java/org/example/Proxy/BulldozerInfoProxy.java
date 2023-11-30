package org.example.Proxy;

// Proxy class (BulldozerInfoProxy)
public class BulldozerInfoProxy implements ConstructionEquipmentInfo {
    private final String authorizedUser;

    public BulldozerInfoProxy(String authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    @Override
    public String getEquipmentInfo() {
        if (authorizedUser.equals("admin")) {
            BulldozerInfo realBulldozerInfo = new BulldozerInfo("Model-X", "500 HP");
            return realBulldozerInfo.getEquipmentInfo();
        } else {
            return "Access denied. You are not authorized to view equipment information.";
        }
    }
}
