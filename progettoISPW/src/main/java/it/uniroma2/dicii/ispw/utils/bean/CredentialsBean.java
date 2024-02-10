package it.uniroma2.dicii.ispw.utils.bean;


import it.uniroma2.dicii.ispw.utils.bean.Role;

public class CredentialsBean {
    private final String username;
    private final String password;

    private Role role = null;

    public CredentialsBean(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setRole(Role role){
        this.role=role;
    }
}