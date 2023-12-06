package org.example.Proxy;

// Enhanced Proxy class (EnhancedBulldozerInfoProxy)
public class EnhancedBulldozerInfoProxy implements AuthorizedConstructionEquipmentInfo {
    private String authorizedUser;
    private BulldozerInfo realBulldozerInfo;

    public EnhancedBulldozerInfoProxy() {
        this.authorizedUser = "guest";
    }
    @Override
    public String getEquipmentInfo() {
        if (authorizedUser.equals("admin")) {
            if (realBulldozerInfo == null) {
                realBulldozerInfo = new BulldozerInfo("Model-X", "500 HP");
            }
            return realBulldozerInfo.getEquipmentInfo();
        } else {
            return "Access denied. You are not authorized to view equipment information.";
        }
    }

    @Override
    public void setAuthorizedUser(String authorizedUser) {
        this.authorizedUser = authorizedUser;
    }
}
