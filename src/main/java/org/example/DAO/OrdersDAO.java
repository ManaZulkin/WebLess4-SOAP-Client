package org.example.DAO;

import entety.Orders;
import jakarta.jws.WebService;
import org.example.DAO.Interfaces.IOrdersDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "DAO.Interfaces.IOrdersDAO")
public class OrdersDAO implements IOrdersDAO {
    private final String GET_ALL = "select * from orders";

    @Override
    public List<Orders> getAll() {
        List<Orders> orders = new ArrayList<>();
        try(Connection connection = getConection();
            PreparedStatement getAll = connection.prepareStatement(GET_ALL)){
            ResultSet resultSet = getAll.executeQuery();
            while (resultSet.next()){
                orders.add(new Orders(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return orders;
    }

    private Connection getConection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carsshop", "root", "2319A1923b12");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
