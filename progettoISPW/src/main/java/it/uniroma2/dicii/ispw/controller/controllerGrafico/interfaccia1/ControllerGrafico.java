package it.uniroma2.dicii.ispw.controller.controllerGrafico.interfaccia1;

import it.uniroma2.dicii.ispw.utils.bean.IdSessioneBean;

public abstract class ControllerGrafico {
    public abstract void inizializza(IdSessioneBean id);
}
/*Uso del polimorfismo per istanziare i vari controller grafici, in particolare tutti i controller grafici
  che devono essere aggiornati in base all'utente estendono tale classe implementando il metodo inizializza
 */