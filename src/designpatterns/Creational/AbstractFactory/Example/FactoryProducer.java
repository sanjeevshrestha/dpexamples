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
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
        }

        return null;
    }

}
