package com.UserAuth;

public class UserAuth {
    private static UserAuth instance;
    private boolean authenticated;
    private String username;

    // Private constructor
    private UserAuth() {
        this.authenticated = false;
    }

    // Public method to get the instance
    public static synchronized UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }

    // Login method
    public void login(String username) {
        this.authenticated = true;
        this.username = username;
    }

    // Logout method
    public void logout() {
        this.authenticated = false;
        this.username = null;
    }

    // Check if user is authenticated
    public boolean isAuthenticated() {
        return authenticated;
    }

    // Get the username of the authenticated user
    public String getUsername() {
        return username;
    }
}

