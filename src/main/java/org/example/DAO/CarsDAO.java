package org.example.DAO;


import entety.Cars;
import jakarta.jws.WebService;
import org.example.DAO.Interfaces.ICarsDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "DAO.Interfaces.ICarsDAO")
public class CarsDAO implements ICarsDAO {
    private final String GET_ALL = "select * from cars";

    @Override
    public List<Cars> getAll() {
        List<Cars> cars = new ArrayList<>();
        try(Connection connection = getConection();
            PreparedStatement getAll = connection.prepareStatement(GET_ALL)){
            ResultSet resultSet = getAll.executeQuery();
            while (resultSet.next()){
                cars.add(new Cars(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getInt(4)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cars;
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
