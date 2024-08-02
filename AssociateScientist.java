/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author LENOVO
 */
public class AssociateScientist extends Researcher {
    private int yearOfExperience; 

    public AssociateScientist(int yearOfExperience, String n, int b, int y) {
        super(n, b, y);
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return super.toString()+"AssociateScientist{" + "yearOfExperience=" + yearOfExperience + '}';
    }

    @Override
    public int computeSalary() {
        return this.getYearlySalary()+this.yearOfExperience*2000;
    }
    
    
}

    
    

