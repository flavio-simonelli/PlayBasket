package com.example.progettoispw;

public class aggiungiCampoControllerApplicativoVip extends Decorator{
    public aggiungiCampoControllerApplicativoVip(aggiungiCampoControllerApplicativo component) {
        super(component);
    }
    private void decorazioneAggiunta(requestBean request){

        factoryEmail fact=new factoryEmail();
        email mail=fact.createEmail(0);
        mail.mandaEmail(request);
    }
    @Override
    public void inviaRichiestaManager(requestBean request) {
        super.inviaRichiestaManager(request);
        this.decorazioneAggiunta(request);

    }

}
