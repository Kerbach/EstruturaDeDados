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
public class TestDoubleNode
{
    public static void main(String[] args)
    {
        DoubleNode x = new DoubleNode(null, 1, null);
        DoubleNode y = new DoubleNode(null, 2, null);
        DoubleNode z = new DoubleNode(null, 3, null);
        
        x.next = y;
        y.previous = x;
        y.next = z;
        z.previous = y;
        
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);
    }
}
