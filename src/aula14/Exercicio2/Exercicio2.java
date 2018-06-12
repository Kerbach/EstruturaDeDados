package aula14.Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import questao2.Entrada;

public class Exercicio2
{

    public static void main(String[] args)
    {
        String palavra = Entrada.leiaString("Escreva uma palavra");

        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();

        for (int i = 0; i < palavra.length(); i++)
        {
            char letra = palavra.charAt(i);
            if (map .containsKey(letra))
            {
                map .put(letra, map .get(letra) + 1);
            } else
            {
                map .put(letra, 1);
            }
        }

        ArrayList<Caractere> caractere = new ArrayList<Caractere>();

        for (char k : map .keySet())
        {
            caractere.add(new Caractere(k, map .get(k)));
        }

        Collections.sort(caractere);
        System.out.println(caractere);
    }

}
