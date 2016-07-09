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
public class ShapeFactory {
    
    public Shape getShape(String shapeType)
    {
        if(shapeType==null)
        {
            return null;
        }
        
        switch(shapeType.toUpperCase())
        {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
           
        }
        
        return null;
        
    }
    
}
