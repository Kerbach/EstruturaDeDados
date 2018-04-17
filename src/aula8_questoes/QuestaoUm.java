/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private String string;
    private HashMap histogram = new HashMap();

    public HashMap createHistgram(String string)
    {
        this.string = string;
        for (int i = 0; i < string.length(); i++)
        {
            char a = string.charAt(i);
            if (histogram.containsKey(a))
            {
                histogram.put(a, Integer.parseInt(histogram.get(a).toString()) + 1);
            } else
            {
                histogram.put(a, 1);
            }
        }
        return histogram;
    }
}
