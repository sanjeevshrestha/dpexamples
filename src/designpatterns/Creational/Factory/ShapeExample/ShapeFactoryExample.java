/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Factory.ShapeExample;

/**
 *
 * @author sanjeev
 */
public class ShapeFactoryExample {
    
    
    public static void main(String[] args) {
        
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shpCircle=shapeFactory.getShape("circle");
        shpCircle.draw();
        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("rectangle").draw();
        
        
    }
    
}
