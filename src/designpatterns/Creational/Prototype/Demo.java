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
public class Demo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        System.out.println("=====Cached objects=====");
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape :" + clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape :" + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape :" + clonedShape3.getType());

    }

}
