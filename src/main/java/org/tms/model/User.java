package org.tms.model;

public class User {
    private String login = "standard_user";
    private String password = "secret_sauce";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
