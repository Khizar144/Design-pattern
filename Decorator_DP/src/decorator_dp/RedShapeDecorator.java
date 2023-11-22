/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_dp;

/**
 *
 * @author hp
 */
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape dShape) {
        super(dShape);
    }
    @Override
    public void draw(){
    deShape.draw();
        setBorder(deShape);
    }
    private void setBorder(Shape dShape){
        System.out.println(dShape.getClass().getSimpleName()+" with Border color :red");
    
    }
}
