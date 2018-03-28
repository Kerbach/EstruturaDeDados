/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import static aula6.TestSequentialSearch.sequential_serach;
import java.util.Random;

/**
 *
 * @author wrkerber
 */
public class TestBinarySearch
{
    public static int binary_search(int[] a, int v)
    {
        int c = 0;
        int begin = 0; // Início
        int end = a.length - 1; // Fim
        
        while (begin <= end)
        {
            int middle = (begin+end)/2;
            c++;
            if (v == a[middle])
            {
                break;
            }
            c++;
            if (v < a[middle])
            {
                // Lado esquerdo
                end = middle-1;
            }
            else
            {
                // Lado direito
                begin = middle+1 ;
            }
        }
        return c;
    }
    
    public static void main(String[] args)
    {
        int trials = 1000; // tentativas
        
        for (int n = 10; n <= 1000; n += 10)
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
                sum += binary_search(array, r.nextInt(n));
            }
            System.out.println(n + ", " + sum / trials);
        }
    }
}
