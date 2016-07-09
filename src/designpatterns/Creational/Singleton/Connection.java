/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Singleton;

/**
 *
 * @author sanjeev
 */
public class Connection {

    private static Connection INSTANCE;

    static {
        INSTANCE = new Connection();
    }

    private Connection()
    {
        System.out.println("Only called by me");
        
    }
    public static Connection getInstance() {
        return INSTANCE;
    }

    
    public void status()
    {
        System.out.println("Yes I am connected");
        System.out.println("My Hash Code : "+System.identityHashCode(this));
    }
}
