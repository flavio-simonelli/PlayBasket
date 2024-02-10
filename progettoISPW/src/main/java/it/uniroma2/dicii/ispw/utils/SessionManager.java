package it.uniroma2.dicii.ispw.utils;

import it.uniroma2.dicii.ispw.utils.bean.GestoreBean;
import it.uniroma2.dicii.ispw.utils.bean.GiocatoreBean;
import it.uniroma2.dicii.ispw.utils.bean.ProprietarioBean;
import it.uniroma2.dicii.ispw.utils.bean.Role;

import java.util.ArrayList;
import java.util.List;

public class SessionManager {
    private List<Session> sessioniAttive = new ArrayList<>();

    private static SessionManager instance = null;

    protected SessionManager(int i) {}

    public static SessionManager getSessionManager(){
            if (SessionManager.instance == null) {
                SessionManager.instance = new SessionManager(0);
            }
            return instance;
        }


    public Session createSession(GiocatoreBean giocatoreBean, ProprietarioBean proprietarioBean, GestoreBean gestoreBean, Role role,int idSession ){
        return new Session(giocatoreBean,proprietarioBean,gestoreBean,role,idSession);
    }

    // Aggiunge una nuova sessione attive
    public void aggiungiSessione(Session sessione){
        sessioniAttive.add(sessione);
    }

    // Rimuove una sessione attiva
    public void rimuoviSessione(int idSession) {
        sessioniAttive.removeIf(sessione -> sessione.getID() == idSession);
    }
}

