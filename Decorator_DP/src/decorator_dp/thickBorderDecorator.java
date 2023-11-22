package decorator_dp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class thickBorderDecorator extends ShapeDecorator{
    
    public thickBorderDecorator(Shape dShape) {
        super(dShape);
       
    }
      @Override
    public void draw(){
    deShape.draw();
        setBorder(deShape);
    }
     private void setBorder(Shape dShape){
        System.out.println(dShape.getClass().getSimpleName()+" with thick  Border ");
    
    }
    
}
