/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab l=new Lab("MCC");
        AssociateScientist as=new AssociateScientist(10,"A",2000,2020);
    boolean x=l.hireResearcher(as);
    x=l.hireResearcher(new SeniorScientist(true,"Ali",1945,2000));
    x=l.hireResearcher(new SeniorScientist(false,"Seif",1970,1000));
  System.out.print(l);
    }
}

    