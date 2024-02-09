package it.uniroma2.dicii.ispw.utils;

import it.uniroma2.dicii.ispw.utils.bean.GestoreBean;
import it.uniroma2.dicii.ispw.utils.bean.GiocatoreBean;
import it.uniroma2.dicii.ispw.utils.bean.ProprietarioBean;
import it.uniroma2.dicii.ispw.utils.bean.Role;

public class SessionManager {

    private static SessionManager instance = null;

    private int SessioneAttive = 0;

    protected SessionManager(int i) {}

    public static SessionManager getSessionManager(){
            if (SessionManager.instance == null) {
                SessionManager.instance = new SessionManager(0);
            }
            return instance;
        }

     public Session createSession(GiocatoreBean giocatoreBean, ProprietarioBean proprietarioBean, GestoreBean gestoreBean, Role role){
        this.SessioneAttive ++;
        return new Session(giocatoreBean,proprietarioBean,gestoreBean,role);
     }
}

