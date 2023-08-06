package org.example;

import jakarta.xml.ws.Service;
import org.example.DAO.CarsDAO;
import org.example.DAO.ClientsDAO;
import org.example.DAO.Interfaces.ICarsDAO;
import org.example.DAO.Interfaces.IClientsDAO;
import org.example.DAO.Interfaces.IMarksDAO;
import org.example.DAO.Interfaces.IOrdersDAO;
import org.example.DAO.MarksDAO;
import org.example.DAO.OrdersDAO;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL cars = new URL("http://laptop-sloaj3ib:8080/WebLess4-SOAP-1.0-SNAPSHOT/CarsDAOService?wsdl");
        URL clients = new URL("http://LAPTOP-SLOAJ3IB:8080/WebLess4-SOAP-1.0-SNAPSHOT/ClientsDAOService?wsdl");
//        URL marks = new URL();
//        URL orders = new URL();

        QName qCars = new QName("http://DAO/", "CarsDAOService");
        QName qClients = new QName("http://DAO/","ClientsDAOService");
//        QName qMarks = new QName();
//        QName qOrders = new QName();

        QName pCars = new QName("http://DAO/", "CarsDAOPort");
        QName pClients = new QName("http://DAO/","ClientsDAOPort");
//        QName pMarks = new QName();
//        QName pOrders = new QName();

        Service servCars = Service.create(cars, qCars);
        Service servClients = Service.create(clients, qClients);
//        Service servMarks = Service.create(marks, qMarks);
//        Service servOrders = Service.create(orders, qOrders);


        ICarsDAO carsDAO = servCars.getPort(pCars, ICarsDAO.class);
        IClientsDAO clientsDAO = servClients.getPort(pClients, IClientsDAO.class);
//        IMarksDAO marksDAO = servMarks.getPort(pMarks, IMarksDAO.class);
//        IOrdersDAO ordersDAO = servOrders.getPort(pOrders, IOrdersDAO.class);

        System.out.println("Finish");

//        System.out.println(carsDAO.getAll());
        System.out.println(clientsDAO.getAll());
//        marksDAO.getAll();
//        ordersDAO.getAll();

    }
}