package org.example.DAO.Interfaces;

import entety.Orders;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;
@WebService
public interface IOrdersDAO {
    @WebMethod
    List<Orders> getAll();
}
