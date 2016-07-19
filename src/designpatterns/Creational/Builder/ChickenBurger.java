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
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 12.50f;
    }

    @Override
    public String name() {
        
        return "Chicken Burger";
    }
    
}
