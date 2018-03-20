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
public class TesteMyList
{
    public static void main(String[] args)
    {
        // Código SUPER IMPORTANTE QUE VAI SER UTILIZADO PARA UM MONTE DE COISA
        
        MyList list = new MyList();
        
        Node a = list.insertFirst(1);
        Node b = list.insertFirst(2);
        Node c = list.insertFirst(3);
        
        Node d = list.insertAfter(b, 4);
           
//        Node n = list.first();
//        while (n != null)
//        {
//            n.toString();
//            n = n.next;
//        }

        System.out.println("Lista: " + list); // Faz a mesma coisa que o trecho acima comentado
        System.out.println("Tamanho: " + list.size());
        System.out.println("Último: " + list.last()); 
        System.out.println(list.find(2) != null); // Verifica se o 2 está na lista
    }
}
