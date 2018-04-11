/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wrkerber
 */
public class QuestaoUm
{
    /* Implemente um método que receba uma string e conte o número de ocorrências 
    de cada letra dentro dela, ignorando quaisquer outros caracteres. Em seguida, 
    imprima o histograma resultante da frequência do caractere. 
    
    Implement a method that receives a string and counts the number of occurrences 
    of each letter within it, ignoring any other characters. Then print the 
    resulting histogram of character frequency.*/
    
    public static void histogram (String s)
    {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (m.containsKey(c))
            {
                m.put(c, m.get(c) + 1);
            }
            else
            {
                m.put(c, 1);
            }
        }
        
        System.out.println(m);
    }
    
    public static void main(String[] args)
    {
        histogram("Teste de string a ser analisada");
    }
}
