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
public interface Item {
    
    public String name();
    public Packing packing();
    public float price();
    
}
