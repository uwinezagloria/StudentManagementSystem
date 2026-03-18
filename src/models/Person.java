package models;

public class Person {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phone;
    protected String password;

    public Person(String firstName,String lastName,String email,String phone,String password){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;

    }

}