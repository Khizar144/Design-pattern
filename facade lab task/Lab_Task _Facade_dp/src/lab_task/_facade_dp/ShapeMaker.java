/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task._facade_dp;

/**
 *
 * @author hp
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape squre;
    public  ShapeMaker(){
    circle=new Circle();
    rectangle=new Rectangle();
    squre=new Squre();
    }
     public void drawCircle(String... options){
      circle.draw( options);
   }
   public void drawRectangle(String... options ){
      rectangle.draw(options);
   }
   public void drawSquare(String... options){
      squre.draw(options);
   }
    
}
