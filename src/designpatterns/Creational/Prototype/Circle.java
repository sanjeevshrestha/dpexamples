/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Prototype;

/**
 *
 * @author sanjeev
 */
public class Circle extends Shape{

    public Circle() {
        type="Circle";
    }

    
    @Override
    public void draw() {
        System.out.println("Circle : Draw");
    }
    
}
