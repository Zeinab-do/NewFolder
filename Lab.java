/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
public class Lab {
    private String name;
    private ArrayList<Researcher>res;
    private int MAX_NUM_RESEARCHERS;

    public Lab(String name) {
        this.name = name;
        this.MAX_NUM_RESEARCHERS=5;
        res=new Arraylist();
    }
    public boolean hireResearcher(Researcher r){
     if(res.size()<=this.MAX_NUM_RESEARCHERS){
         res.add(r);
         return true;
     }   
    System.out.print("No vacancy");
    return false;
    }
    public ArrayList<SeniorScientist> findTeamLeaders(){
        ArrayList<SeniorScientist> a=new ArrayList();
     for( int i=0;i<res.size();i++){
            Researcher s = res.get(i);
            SeniorScientist  ss = (SeniorScientist)s;
            if(s instanceof SeniorScientist && ss.isTeamLeader())
            a.add(ss);
     }  
     return a;
    }

    @Override
    public String toString() {
        return "Lab{" + "name=" + name + ", res=" + res + ", MAX_NUM_RESEARCHERS=" + MAX_NUM_RESEARCHERS + '}';
    }
    

    private static class Arraylist extends ArrayList<Researcher> {

        public Arraylist() {
        }
    }
    
}
