package day17;

// Grandparent class
class Person{
String name = "tushar";
}
// Parent class
class Employee extends Person {
String company = "BOOST STAR Experts";
}
// Child class
class Manager extends Employee {
String department = "Internship";
}
public class Multilevel_Inheritance {
public static void main(String[] args) {
    
    Manager mgr = new Manager();
    
    System.out.println("Name: " + mgr.name);
    // Inherited from Person 
    
    System.out.println("Company: " + mgr.company);
    // Inherited from Employee
    
    System.out.println("Department: " + mgr.department); // Defined in Manager
}}