package it.uniroma2.dicii.ispw.model;

public class UserModel{
    private String username;
    private String email;
    private int codice;

    public UserModel(String username, String email, int codice){
        this.username=username;
        this.email=email;
        this.codice=codice;
    }

    public int getCode(){
        return this.codice;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }



}
