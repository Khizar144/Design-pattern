/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator_dp;

/**
 *
 * @author hp
 */
public class Decorator_DP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape circle = new Circle();
        Shape rectangel = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape thickCircle = new thickBorderDecorator(new Circle());
        Shape redThickCircle=new thickBorderDecorator(new RedShapeDecorator(new Circle()));
//        System.out.println("Circle with normal border");
//        circle.draw();
//        System.out.println("\nCircle of red border");
//        redCircle.draw();
//        System.out.println("\nRectangle of red border");
//      redRectangle.draw();
//      System.out.println("\nCircle of thick border");
//      thickCircle.draw();

        System.out.println("Circle without decoration");
        circle.draw();
        System.out.println("Reactangle without decoration");
        rectangel.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("\nRed and thick circle");
redThickCircle.draw();
    }

}
