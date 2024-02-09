package it.uniroma2.dicii.ispw.utils.bean;


import it.uniroma2.dicii.ispw.utils.bean.Role;

public class CredentialsBean {
    private final String username;
    private final String password;

    private final Role role;

    public CredentialsBean(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}