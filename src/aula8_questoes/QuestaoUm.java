package aula8_questoes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wrkerber
 */

/*  01. Implemente um método que receba uma string e conte o número de ocorrências 
    de cada letra dentro dela, ignorando quaisquer outros caracteres. Em seguida, 
    imprima o histograma resultante da frequência do caractere. 
    
    01. Implement a method that receives a string and counts the number of occurrences
    of each letter within it, ignoring any other characters. Then print the resulting
    histogram of character frequency.*/
public class QuestaoUm
{
    public static void histogram(String s)
    {

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (m.containsKey(c))
            {  // Testa se ja tem um valor dentro
                m.put(c, m.get(c) + 1);// se ja tiver apenas atualiza
            } else
            {
                m.put(c, 1);    // se nao tiver , adiciona
            }

        }
        System.out.println(m);
    }

    public static void main(String[] args)
    {
        histogram("copacabana");
    }
}
