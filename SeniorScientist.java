/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class SeniorScientist extends Researcher {
    private boolean teamLeader;

    public SeniorScientist(boolean teamLeader, String n, int b, int y) {
        super(n, b, y);
        this.teamLeader = teamLeader;
    }

    public void setTeamLeader() {
       Scanner in=new Scanner (System.in);
       System.out.println("Enter True/False for the team leader:");
    boolean b=in.nextBoolean();
    teamLeader=b;
    }

    @Override
    public String toString() {
        return super.toString()+"SeniorScientist{" + "teamLeader=" + teamLeader + '}';
    }

    @Override
    public int computeSalary() {
     if(this.teamLeader==true)  
         return this.getYearlySalary()+25000;
     else
         return this.getYearlySalary()+1500;
    }
    public boolean isTeamLeader(){
        return teamLeader;
    }
    
}

   
