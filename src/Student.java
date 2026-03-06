/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Student extends Person implements DatabaseOperations {
    private String id; // [cite: 45]
    private String course; // [cite: 45]
    private double marks; // [cite: 45]

    public Student(String name, String email, String id, String course, double marks) {
        super(name, email); // Calls the Person constructor
        this.id = id;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public void displayInfo() {
        // Logic to show student details in the GUI (e.g., in a JTable) [cite: 45]
    }

    @Override
    public void add() {
        // Use JDBC PreparedStatement here to insert into MySQL [cite: 47, 51]
    }

    // Implement delete(), update(), and search() similarly... [cite: 45]

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
