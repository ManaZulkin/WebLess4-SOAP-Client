package org.example.DAO.Interfaces;

import entety.Clients;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


import java.util.List;
@WebService
public interface IClientsDAO {
    @WebMethod
    List<Clients> getAll();
}
