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
public class TesteMyDoubleList
{
    public static void main(String[] args)
    {
        MyDoubleList list = new MyDoubleList();
        
        DoubleNode a = list.insertFirst(1);
        DoubleNode b = list.insertFirst(2);
        DoubleNode c = list.insertFirst(3);
        
           
//        Node n = list.first();
//        while (n != null)
//        {
//            n.toString();
//            n = n.next;
//        }

        System.out.println("Lista: " + list); // Faz a mesma coisa que o trecho acima comentado
        System.out.println("Último: " + list.last()); 
        System.out.println("Procurar: " + list.find(4)); 
    }
}
