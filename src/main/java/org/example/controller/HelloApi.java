package org.example.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.model.Person;

@Path("hello")
public class HelloApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Person postPerson(Person person){
        System.out.println(person);
        return person;
    }
}
