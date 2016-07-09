/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.AbstractFactory.Example;

/**
 *
 * @author sanjeev
 */
public abstract class AbstractFactory {
    
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
    
    
}
