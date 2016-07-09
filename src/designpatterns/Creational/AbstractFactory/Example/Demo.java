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
public class Demo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        shapeFactory.getShape("Square").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("circle").draw();

        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();
        colorFactory.getColor("blue").fill();

    }

}
