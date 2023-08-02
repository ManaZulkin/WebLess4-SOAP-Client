package org.example.DAO.Interfaces;


import org.example.DAO.CarsDAO;
import org.example.DAO.ClientsDAO;
import org.example.DAO.MarksDAO;
import org.example.DAO.OrdersDAO;

public interface IDAOFactory {

    public CarsDAO getCarsDAO();
    public ClientsDAO getClientsDAO();
    public MarksDAO getMarksDAO();
    public OrdersDAO getOrdersDAO();

}
