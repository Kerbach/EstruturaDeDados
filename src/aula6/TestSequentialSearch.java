/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Random;

/**
 *
 * @author wrkerber
 */
public class TestSequentialSearch
{
    public static int sequential_serach(int [] a, int v)
    {
        int c = 0; // número de comparações
        for (int i = 0; i < a.length; i++)
        {
            c++;
            if (a[i] == v)
            {
                break;
            }
        }
        return c;
    }
    
    public static void main (String[] args)
    {
        int trials = 1000; // tentativas
        
        for (int n = 100; n <= 1000; n += 10)
        {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = i;
            }
            
            Random r = new Random(1); // semente (seed);
            
             double sum = 0.0;
            for (int i = 0; i < trials; i++)
            {
                sum += sequential_serach(array, r.nextInt(n));
            }
            System.out.println(n + ", " + sum / trials);
        }
    }
}
