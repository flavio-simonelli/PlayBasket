package it.uniroma2.dicii.ispw.utils;

import it.uniroma2.dicii.ispw.utils.bean.*;

public class Session {
    private final GiocatoreBean giocatoreBean;
    private final ProprietarioBean proprietarioBean;
    private final GestoreBean gestoreBean;
    private final Role role;
    private final int idSession;

    public GiocatoreBean getGiocatoreBean(){ return giocatoreBean;}
    public ProprietarioBean getProprietarioBean(){ return proprietarioBean;}
    public GestoreBean getGestoreBean(){ return gestoreBean;}

    public Session(GiocatoreBean giocatoreBean, ProprietarioBean proprietarioBean, GestoreBean gestoreBean, Role role, int idSession){
        this.giocatoreBean = giocatoreBean;
        this.proprietarioBean = proprietarioBean;
        this.gestoreBean = gestoreBean;
        this.role = role;
        this.idSession=idSession;
    }

    public int getID() {
        return idSession;
    }
}
