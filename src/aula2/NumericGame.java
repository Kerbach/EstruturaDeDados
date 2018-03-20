package aula2;

import java.util.Random;
import java.util.Scanner;

public class NumericGame
{
    public static void main(String[] args) throws Exception
    {
        MyQueue fila = new MyQueue();
        for (int i = 0; i < 5; i++)
        {
            Random random = new Random(); 
            int x = random.nextInt(31);
            x += 20;
            fila.add(x);
        }
        
        while(fila.size() > 1)
        {
            System.out.println(fila);
            Scanner s = new Scanner(System.in);

            System.out.println("\nDigite um número inteiro:");
            int numero = s.nextInt();
            while (numero <= 1)
            {
                numero = s.nextInt();
            }
            
            boolean divisivel = true;
            while (divisivel && fila.size() > 0)
            {
                divisivel = false;
                double resto = fila.first() % numero;
                if(resto == 0)
                {
                    System.out.println("Removido: " + fila.first());
                    fila.remove();
                    divisivel = true;
                }
            }
            if (fila.size() > 0)
            {
                Random random = new Random();
                int x = random.nextInt(31);
                x += 20;
                fila.add(x);
                System.out.println("Adicionado: " + x);
            }
        }
        System.out.println("Fim!");
    }
}
