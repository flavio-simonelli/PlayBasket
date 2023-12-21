package com.example.progettoispw;

public class factoryEmail {
    public email createEmail(int type){
        if(type==0){
            return new emailManager();
            }
        else {
            return new emailOwner();
        }

        }
    }

