package com.library.entity.clientbuilder;

import com.library.entity.clientbuilder.ClientBuider;
import com.library.model.request.ClientRequest;

import java.time.LocalDate;

public class RegisteredClient extends ClientBuider {

    ClientRequest clientRequest;

    public RegisteredClient(ClientRequest clientRequest) {
        this.clientRequest = clientRequest;
    }

    @Override
    public void buildClient() {
        createNewClient();
        client.setId(clientRequest.getId());
        client.setFirstName(clientRequest.getFirstName());
        client.setLastName(clientRequest.getLastName());
        client.setLogin(clientRequest.getLogin());
        client.setPassword(clientRequest.getPassword());
        client.setHomeAddress(clientRequest.getHomeAdress());
        client.setPhoneNumber(clientRequest.getPhoneNumber());
        client.setBirthDate(LocalDate.parse(clientRequest.getBirthDate()));
        client.setRegistrationDate(LocalDate.now());
    }
}