
package models;

import database.DatabaseConnection;
import interfaces.DatabaseOperations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonService extends Person implements DatabaseOperations {

    public PersonService(String firstName,String lastName,String email,String phone,String password){
        super(firstName,lastName,email,phone,password);
    }

    @Override
    public void add(){

        try{

            Connection conn = DatabaseConnection.getConnection();

            String sql = "INSERT INTO person(first_name,last_name,email,phone,password) VALUES(?,?,?,?,?)";

            
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, password);

            ps.executeUpdate();

            System.out.println("Person added successfully");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id){

        try{

            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM Person WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Person deleted");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void update(int id){

        try{

            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE Person SET first_name=?,last_name=?,email=?,phone=?,password=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, password);
            ps.setInt(6, id);

            ps.executeUpdate();

            System.out.println("Person updated");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void search(String keyword){

        try{

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM Person WHERE first_name LIKE ? OR last_name LIKE ? OR email LIKE ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            String word = "%" + keyword + "%";

            ps.setString(1,word);
            ps.setString(2,word);
            ps.setString(3,word);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("first_name") + " " +
                        rs.getString("last_name") + " " +
                        rs.getString("email") + " " +
                        rs.getString("phone")
                );

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}