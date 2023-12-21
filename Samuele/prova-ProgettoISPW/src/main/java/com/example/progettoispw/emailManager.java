package com.example.progettoispw;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class emailManager implements email{

    public void mandaEmail(requestBean request) {
                // Impostazioni per la connessione al server SMTP
        String host = "smtp.libero.it";
        String username = "emailMittente";
        String password = "password";

                // Proprietà per configurare la connessione al server SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

                // Creazione della sessione
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
        });

        try {
                    // Creazione del messaggio
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("indirizzoEmail mittente"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("indirizzoEmail destinatario"));
            message.setSubject("Richiesta campo");
            message.setText("Ciao ti è stata appena mandata la richiesta di aggiunta del campo: *****"+request.nomeCampo+"*****");

                    // Invio del messaggio
            Transport.send(message);

           // System.out.println("Email inviata con successo!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Errore nell'invio dell'email: " + e.getMessage());
        }
    }
}



