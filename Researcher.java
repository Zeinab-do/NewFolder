/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author LENOVO
 */
public abstract class Researcher {
    private String name;
    private int birthYear;
    private int yearlySalary;

    public Researcher(String n, int b, int y) {
        name = n;
        birthYear = b;
        yearlySalary = y;
    }
    public abstract int computeSalary();
public int compareTo(Researcher r){
    if(this.name.equals(r.name))
        return 0;
    else
        return 1;
}
    @Override
    public String toString() {
        return "Researcher{" + "name=" + name + ", birthYear=" + birthYear + ", yearlySalary=" + yearlySalary + '}';
    }  
    public int getYearlySalary(){
        return this.yearlySalary;
    }
}
