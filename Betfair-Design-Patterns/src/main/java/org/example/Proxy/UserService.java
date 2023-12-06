package org.example.Proxy;

// User Service (UserService)
public class UserService {
    public boolean checkAuthorization(String username, String role) {
        // Simplu exemplu de verificare a autorizației
        return role.equals("admin");
    }
}
