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

    public static void main(String[] args)
    {
        System.out.println(fatorial(20));
    }
}
