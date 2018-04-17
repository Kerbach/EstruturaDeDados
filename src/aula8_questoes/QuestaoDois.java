/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8_questoes;

import java.util.HashMap;

/**
 *
 * @author wrkerber
 */

/* 
    02. Implemente um método que receba uma matriz de strings de tamanhos diferentes,
    mas armazena apenas a primeira string do mesmo tamanho encontrado. No final de
    método você deve imprimir as seqüências selecionadas. Por exemplo, se a entrada for
    {"eu", "bola", "é", "casa", "você", "teste", "não"}, a saída deve ser "eu",
    "bola" e "você"

    02. Implement a method that receives an array of strings of different sizes, 
    but only stores the first string of the same length found. At the end of the 
    method you should print the selected strings. For example, if the input is 
    {"me", "ball", "is", "home", "you", "test", "no"}, the output should be "me", 
    "ball" and "you". */

public class QuestaoDois
{

    private String[] string;
    private HashMap strings = new HashMap();

    public HashMap storeOnlyOne(String[] string)
    {
        this.string = string;
        for (int i = 0; i < string.length; i++)
        {
            int size = string[i].length();
            if (!(strings.containsKey(size)))
            {
                strings.put(size, string[i]);
            }
        }
        return strings;
    }
}
