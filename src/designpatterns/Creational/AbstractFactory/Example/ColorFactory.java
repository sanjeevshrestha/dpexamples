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
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }

        switch (colorType.toUpperCase()) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
        }

        return null;
    }

}
