package it.uniroma2.dicii.ispw.utils.bean;

import it.uniroma2.dicii.ispw.model.GestoreModel;

public class GestoreBean {
    private String username;
    private String email;

    public GestoreBean(String username,String email){
        this.username=username;
        this.email=email;
    }

    public GestoreBean(GestoreModel gestore){
        this.username=gestore.getUsername();
        this.email=gestore.getEmail();
    }


}
