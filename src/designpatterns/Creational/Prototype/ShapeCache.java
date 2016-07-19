/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Creational.Prototype;

import java.util.Hashtable;

/**
 *
 * @author sanjeev
 */
public class ShapeCache {
    
    private static Hashtable<String,Shape> shapeMap=new Hashtable<>();
    
    
    public static Shape getShape(String typeId)
    {
        Shape cachedShape= shapeMap.get(typeId);
        return (Shape) cachedShape.clone();
    }
    
    
    public static void loadCache()
    {
        
        Circle c=new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);
        
             
        Square s=new Square();
        s.setId("2");
        shapeMap.put(s.getId(), s);
        
        Rectangle r=new Rectangle();
        r.setId("3");
        shapeMap.put(r.getId(), r);
        
    }
    
    
    
}
