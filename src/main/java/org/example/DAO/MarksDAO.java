package org.example.DAO;


import entety.Marks;
import jakarta.jws.WebService;
import org.example.DAO.Interfaces.IMarksDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@WebService(endpointInterface = "DAO.Interfaces.IMarksDAO")
public class MarksDAO implements IMarksDAO {
    private final String GET_ALL = "select * from marks";

    @Override
    public List<Marks> getAll() {
        List<Marks> marks = new ArrayList<>();
        try(Connection connection = getConection();
            PreparedStatement getAll = connection.prepareStatement(GET_ALL)){
            ResultSet resultSet = getAll.executeQuery();
            while (resultSet.next()){
                marks.add(new Marks(resultSet.getInt(1),
                        resultSet.getString(2)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return marks;
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
