package org.example.DAO.Interfaces;

import entety.Cars;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


import java.util.List;
@WebService
public interface ICarsDAO {
    @WebMethod
    List<Cars> getAll();

}
