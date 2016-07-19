/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Builder;

/**
 *
 * @author sanjeev
 */
public class VegBurger extends Burger{

    @Override
    public float price() {
        return 10.50f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
    
}
