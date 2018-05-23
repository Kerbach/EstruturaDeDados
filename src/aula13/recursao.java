/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author wrkerber
 */
public class recursao
{
    public static void func(int n)
    {
        if (n == 1)
        {
            System.out.println("end");
        } else
        {
            func(n - 1);
        }
        System.out.println(n);
    }

    public static int fatorial(int n)
    {
        if (n == 1)
        {  // caso de parada
            return 1;
        } else
        {
            return n * fatorial(n - 1); // caso geral
        }
    }

    public static int fibonacci(int n)
    {
        if (n == 1 || n == 2)
        {  // caso de parada
            return 1;
        } else
        {
            return fibonacci(n - 1) + fibonacci(n - 2); // caso geral
        }
    }
    
    public static double sum (double[] v, int i)
    {
        if (i == v.length - 1) // Caso de parada
        {
            return v[i];
        }
        else // Caso geral
        {
            return v[i] + sum(v, i + 1);
        }
    }
    
    public static void binary (int n, String s)
    {
        if (n == 0)
        {
            System.out.println(s);
        }
        else
        {
            binary(n - 1, s + '0');
            binary(n - 1, s + '1');
        }
    }
    
    public static void abcde (int n, String s)
    {
        if (n == 0)
        {
            System.out.println(s);
        }
        else
        {
            abcde(n - 1, s + 'a');
            abcde(n - 1, s + 'b');
            abcde(n - 1, s + 'c');
            abcde(n - 1, s + 'd');
            abcde(n - 1, s + 'e');
        }
    }

    public static void main(String[] args)
    {
        //System.out.println(fatorial(20));
        // double[] x = {1.2, 3.4, 5.6, 7.8};
        // System.out.println(sum(x, 0));
        //binary(3, "");
        abcde(4, "");
    }
}
