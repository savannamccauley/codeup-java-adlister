package controllers;

public class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return "savanna";
    }
    public String getPassword() {
        return "savanna123";
    }
}
