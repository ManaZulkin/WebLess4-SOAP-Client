package org.example.DAO.Interfaces;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ITranslate {
    @WebMethod
    String translate(String word);
}