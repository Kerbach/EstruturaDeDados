/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import aula3.*;

/**
 *
 * @author wrkerber
 */
public class MyDoubleList
{
    private DoubleNode header;
    private DoubleNode trailer;
    private int size;
    
    public DoubleNode first()
    {
        return this.header;
    }
    
    public DoubleNode last ()
    {
        DoubleNode n = this.first();
        while (n != null)
        {
            if (n.next == null)
            {
                break;
            }
            n = n.next;
        }
        return n;
    }
    
    public int size() { return this.size; }
    
    public DoubleNode insertFirst(int e)
    {
        DoubleNode old = first();
        DoubleNode n = new DoubleNode(null, e, old);
        if (old != null)
        {
            old.previous = n;
        }
        else
        {
            this.trailer = n;
        }
        this.header = n;
        this.size++;
        return n;
    }
    
    public DoubleNode insertAfter (DoubleNode n, int e)
    {
        
        DoubleNode seguinte = n.next;
        DoubleNode novo = new DoubleNode(n, e, seguinte);
        n.next = novo;
        if (seguinte != null)
        {
            seguinte.previous = novo;
        }
        
        this.size++;
        return novo;
    }
    
    public DoubleNode find(int e)
    {
        DoubleNode n = this.first();
        while (n != null)
        {
            if (n.element == e)
            {
                return n;
            }
            n = n.next;
        }
        return null;
    }
    
    @Override
    public String toString()
    {
        String s = "";
        DoubleNode n = first();
        while (n != null)
        {
            s += n.toString();
            n = n.next;
        }
        return s;
    }
}
