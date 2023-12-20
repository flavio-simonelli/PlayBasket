package com.example.progettoispw;

public class aggiungiCampoControllerApplicativoUltra extends Decorator{
    public aggiungiCampoControllerApplicativoUltra(aggiungiCampoControllerApplicativo component) {
        super(component);
    }
    private void decorazioneAggiunta(){
        System.out.println("Ciao sono un utente ultra");
    }
    @Override
    public void inviaRichiestaManager(requestBean request) {
        super.inviaRichiestaManager(request);
        this.decorazioneAggiunta();

    }

}