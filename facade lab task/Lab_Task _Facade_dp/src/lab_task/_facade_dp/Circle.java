/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task._facade_dp;

/**
 *
 * @author hp
 */
public class Circle implements Shape{

    @Override
    public void draw(String... options) {
System.out.println("Circle::draw()"+printoptions(options));    }

    private String printoptions(String[] options) {
        String opt=" ";
        for(String op:options){
        opt+= op+" ";
        
        
        }
        
        return  opt;
    }
    
}
