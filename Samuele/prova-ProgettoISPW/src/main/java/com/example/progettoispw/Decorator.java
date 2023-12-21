package com.example.progettoispw;

public abstract class Decorator extends aggiungiCampoControllerApplicativo {
    private aggiungiCampoControllerApplicativo component;

    public Decorator( aggiungiCampoControllerApplicativo component){
        this.component = component;
    }

    @Override
    public void inviaRichiestaManager(requestBean request) {
        this.component.inviaRichiestaManager(request);
    }
}
