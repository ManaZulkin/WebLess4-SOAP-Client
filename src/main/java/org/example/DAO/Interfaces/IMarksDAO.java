package org.example.DAO.Interfaces;

import entety.Marks;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


import java.util.List;
@WebService
public interface IMarksDAO {
    @WebMethod
    List<Marks> getAll();
}
