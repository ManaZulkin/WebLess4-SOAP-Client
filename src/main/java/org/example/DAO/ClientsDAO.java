package org.example.DAO;


import entety.Clients;
import jakarta.jws.WebService;
import org.example.DAO.Interfaces.IClientsDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "DAO.Interfaces.IClientsDAO")
public class ClientsDAO implements IClientsDAO {
    private final String GET_ALL = "select * from clients";

    @Override
    public List<Clients> getAll() {
        List<Clients> clients = new ArrayList<>();
        try(Connection connection = getConection();
            PreparedStatement getAll = connection.prepareStatement(GET_ALL)){
            ResultSet resultSet = getAll.executeQuery();
            while (resultSet.next()){
                clients.add(new Clients(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return clients;
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
