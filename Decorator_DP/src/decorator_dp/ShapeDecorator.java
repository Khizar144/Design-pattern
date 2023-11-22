/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_dp;

/**
 *
 * @author hp
 */
public class ShapeDecorator implements Shape{
protected Shape deShape;
  public ShapeDecorator(Shape dShape){
  this.deShape=dShape;
  
  }
    
    
    @Override
    public void draw() {
    }
    
}
