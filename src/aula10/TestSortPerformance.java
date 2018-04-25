/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author wrkerber
 */
import java.util.*;

public class TestSortPerformance
{

    public static void test_sort(ArrayList<Integer> a)
    {
        // BubbleSort
        boolean troca = true;
        int aux;
        while (troca)
        {
            troca = false;
            for (int i = 0; i < a.size() - 1; i++)
            {
                if (a.get(i) > a.get(i + 1))
                {
                    aux = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set(i + 1, aux);
                    troca = true;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        int n = 10000;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
        {
            int v = (int) (Math.random() * n);
            array1.add(v);
            array2.add(v);
        }

        // measure time
        long begin, end;
        System.out.println("Time sorting " + n + " integers (in seconds)");

        begin = System.currentTimeMillis();
        Collections.sort(array1);
        end = System.currentTimeMillis();
        System.out.println("  Java sort: " + (end - begin) / 1000.0);

        begin = System.currentTimeMillis();
        test_sort(array2);
        end = System.currentTimeMillis();
        System.out.println("  Test sort: " + (end - begin) / 1000.0);

        // check that arrays match
        for (int i = 0; i < n; i++)
        {
            int v1 = array1.get(i);
            int v2 = array2.get(i);
            if (v1 != v2)
            {
                System.out.println("error: arrays do not match!");
                break;
            }
        }
    }
}
