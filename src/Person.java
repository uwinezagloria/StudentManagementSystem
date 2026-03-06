/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class Person {
    protected String name; // [cite: 29]
    protected String email; // [cite: 30]

    public Person(String name, String email) { // [cite: 31]
        this.name = name; // [cite: 32]
        this.email = email; // [cite: 33]
    }

    public abstract void displayInfo(); // [cite: 36]
}