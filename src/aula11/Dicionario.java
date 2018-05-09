/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import aula8.MyFileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 *
 * @author wrkerber
 */
public class Dicionario
{
    public static double desvioPadrao(ArrayList<Double> valor) 
    {
        Double media = getMedia(valor);
        int tam = valor.size();
        Double desvPadrao = 0D;
        for (Double vlr : valor) {
            Double aux = vlr - media;
            desvPadrao += aux * aux;
        }
        return Math.sqrt(desvPadrao / (tam - 1));
    }
    
    public static Double getMedia(List<Double> valor) 
    {
        try 
        {
            return getSoma(valor) / valor.size();
        } catch (NullPointerException e) 
        {
            throw new IllegalArgumentException("The list has null values");
        }
    }

    public static Double getSoma(List<Double> valor) 
    {
        Double soma = 0D;
        for (int i = 0; i < valor.size(); i++) 
        {
            soma += valor.get(i);
        }
        return soma;
    }
    
    public static void main(String[] args)
    {
        MyFileReader f = new MyFileReader("ign-reviews.csv");
        String s;
        f.readLine();
        s = f.readLine();
        
        String[] separado = s.split (Pattern.quote (";"));
        
        Map <String, Stats> dicionario = new HashMap ();
        for (int i = 0; i < s.length(); i++)
        {
            String ano = separado[8];
            if (dicionario.containsKey(ano))
            {
                Stats estatisticas = dicionario.get(ano);
                estatisticas.num_reviews++;
                if (separado[7].compareTo("Y") == 0)
                {
                    estatisticas.num_editor_choice++;
                }
                if (separado[1].compareTo("Amazing") == 0 || separado[1].compareTo("Masterpiece") == 0)
                {
                    estatisticas.num_amazing++;
                }
                estatisticas.total_scores += Double.parseDouble(separado[5]);
                estatisticas.media_scores = estatisticas.num_reviews / estatisticas.total_scores;
                
                //estatisticas.lista_scores.add(Double.parseDouble(separado[5]));
                
                if (Double.parseDouble(separado[5]) > estatisticas.nota_melhor_jogo)
                {
                    estatisticas.melhor_jogo = separado[2];
                }
                
                if (Double.parseDouble(separado[5]) < estatisticas.nota_pior_jogo)
                {
                    estatisticas.pior_jogo = separado[2];
                }
                
                dicionario.put(ano, estatisticas);
            }
            else
            {
                Stats estatisticas = new Stats();
                
                estatisticas.ano = Integer.parseInt(separado[8]);
                estatisticas.num_reviews++;
                if (separado[7].compareTo("Y") == 0)
                {
                    estatisticas.num_editor_choice++;
                }
                if (separado[1].compareTo("Amazing") == 0 || separado[1].compareTo("Masterpiece") == 0)
                {
                    estatisticas.num_amazing++;
                }
                estatisticas.total_scores += Double.parseDouble(separado[5]);
                
                estatisticas.lista_scores.add(Double.parseDouble(separado[5]));
                
                if (Double.parseDouble(separado[5]) > estatisticas.nota_melhor_jogo)
                {
                    estatisticas.melhor_jogo = separado[2];
                }
                
                if (Double.parseDouble(separado[5]) < estatisticas.nota_pior_jogo)
                {
                    estatisticas.pior_jogo = separado[2];
                }
                
                dicionario.put(ano, estatisticas);
            }

            s = f.readLine();
        }
        
        //System.out.println(dicionario.get("2012"));
        
        
        
        for (String ano : dicionario.keySet())
        {
            Stats estatisticas = dicionario.get(ano);
            System.out.print("Ano: "+estatisticas.ano);
            System.out.print("; Número reviews: "+estatisticas.num_reviews);
            System.out.print("; Percent Amazing ou Masterpiece: "+(estatisticas.num_amazing / estatisticas.num_reviews) * 100);
            System.out.print("; Media Scores: "+estatisticas.num_reviews / estatisticas.total_scores);
            System.out.print("; Desvio padrão scores: "+desvioPadrao(estatisticas.lista_scores));
            System.out.print("; Melhor Jogo: "+estatisticas.melhor_jogo);
            System.out.print("; Pior Jogo: "+estatisticas.pior_jogo);
        }
        
        f.close();
    }
}
