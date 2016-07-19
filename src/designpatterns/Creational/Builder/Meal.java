/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class Meal {

    private List<Item> mealItems = new ArrayList<>();

    public void addItem(Item i) {
        mealItems.add(i);
    }

    public float getCost() {
        float total = 0.0f;

        for (Item i : mealItems) {
            total += i.price();
        }

        return total;
    }

    public void showItems() {
        for (Item item : mealItems) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
