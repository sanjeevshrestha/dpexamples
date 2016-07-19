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
public abstract class Shape implements Cloneable{
    
    protected String id;
    protected String type;
    
    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Object clone()
    {
        Object clone=null;
        try
        {
            clone=super.clone();
            
        }
        catch(CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        
        return clone;
    }
    
}
