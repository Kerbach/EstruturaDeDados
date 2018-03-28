/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author wrkerber
 */

import java.util.Random;
public class TestRandom
{
    public static void main (String [] args)
    {
        Random r = new Random(1); // semente (seed);
        
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i + "," + r.nextDouble());
        }
    }
}
