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
    
    public static class Stats
    {
        public int ano = 0;
        public int num_reviews = 0;
        public int num_editor_choice = 0;
        public int num_amazing = 0;
        public double perc_amazing = 0;
        public double total_scores = 0;
        public double media_scores = 0;
        public List<Double> lista_scores;
        public double desvio_padrao = 0;
        public double nota_melhor_jogo = 0;
        public String melhor_jogo = "";
        public double nota_pior_jogo = 0;
        public String pior_jogo = "";
        public double num_jogos_action = 0;
        public double media_desvio_scores = 0;
    }
    
    public static double desvioPadrao(List<Double> numeros) 
    {
        double media = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);
        double mediaDesvios = numeros.stream().mapToDouble(i -> Math.pow(i - media, 2)).average().orElse(0);
        return Math.sqrt(mediaDesvios);
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
            String ano = separado[9];
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
                    estatisticas.perc_amazing = (estatisticas.num_amazing / estatisticas.num_reviews) * 100;
                }
                estatisticas.total_scores += Double.parseDouble(separado[5]);
                estatisticas.media_scores = estatisticas.num_reviews / estatisticas.total_scores;
                
                //estatisticas.lista_scores.add(Double.parseDouble(separado[5]));
                estatisticas.desvio_padrao = desvioPadrao(estatisticas.lista_scores);
                
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
                
                estatisticas.ano = Integer.parseInt(separado[9]);
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
        
        for (int j = 0; j < dicionario.size();  j++)
        {
            Stats estatisticas = dicionario.get(j);
            System.out.println(estatisticas.ano +" - "+ estatisticas.num_reviews);
            //estatisticas.perc_amazing = (estatisticas.num_amazing / estatisticas.num_reviews) * 100;
        //estatisticas.media_scores = estatisticas.num_reviews / estatisticas.total_scores;
        //estatisticas.desvio_padrao = desvioPadrao(estatisticas.lista_scores);
        }
        
        f.close();
    }
}
