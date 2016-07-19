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
public class Demo {
    
    public static void main(String[] args) {
        
        MealBuilder mb=new MealBuilder();
        
        Meal vegMeal=mb.prepareVegMeal();
        
        System.out.println("=====Veg Meal====");
        vegMeal.showItems();
        System.out.println("Total : "+vegMeal.getCost());
        
        Meal nonVegMeal =mb.prepareNonVegMeal();
        System.out.println("=====Non Veg Meal====");
        nonVegMeal.showItems();
        System.out.println("Total : "+vegMeal.getCost());
        
        
    }
    
}
