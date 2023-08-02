package org.example.DAO;


import org.example.DAO.Interfaces.IDAOFactory;

public class DAOFactory implements IDAOFactory {

    private static IDAOFactory factory;

    private DAOFactory(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static synchronized IDAOFactory getDAOFactory(){
        if(factory == null){
            factory = new DAOFactory();
        }
        return factory;
    }

    @Override
    public CarsDAO getCarsDAO() {
        return new CarsDAO();
    }

    @Override
    public ClientsDAO getClientsDAO() {
        return new ClientsDAO();
    }

    @Override
    public MarksDAO getMarksDAO() {
        return new MarksDAO();
    }

    @Override
    public OrdersDAO getOrdersDAO() {
        return new OrdersDAO();
    }
}
