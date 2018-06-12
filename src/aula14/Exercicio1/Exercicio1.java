/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.Exercicio1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wrkerber
 */
public class Exercicio1
{
    public static void main(String[] args)
    {
         ArrayList<Pessoa> p = new ArrayList<Pessoa>();
        
        Pessoa p1 = new Pessoa("joão", "silva", 16);
        Pessoa p2 = new Pessoa("joão", "pedro", 31);
        Pessoa p3 = new Pessoa("andré", "roma", 68);
        Pessoa p4 = new Pessoa("marco", "costa", 34);
        Pessoa p5 = new Pessoa("daniel", "souza", 27);
        Pessoa p6 = new Pessoa("joão", "silva", 24);

        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        
        Collections.sort(p);
        System.out.println(p);
    }
}
