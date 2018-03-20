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
public class TestNode
{
    public static void main(String[] args)
    {
        Node x = new Node(1, null);
        Node y = new Node(2, null);
        Node z = new Node(3, null);
        
        x.next = y;
        y.next = z;
        
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
    }
}
