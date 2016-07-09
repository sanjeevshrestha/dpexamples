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
public class Demo {
    public static void main(String[] args) {
        
        Connection conn=Connection.getInstance();
        Connection conn2=Connection.getInstance();
        conn.status();
        conn2.status();
        
    }
    
}
