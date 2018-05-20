/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        for (Double vlr : valor)
        {
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
        ArquivoLeitura leitor = new ArquivoLeitura("C:\\TEMP\\ign-reviews.csv");
        HashMap<String, Stats> dicionario = new HashMap();

        leitor.lerLinha();
        String linha = leitor.lerLinha();
        
        //
        // Continaur aqui a parte geral do trabalho .....
        //
        double mediaReviews = 0;
        int contadorReviews = 0;
        double desvioPadraoTodos = 0;
        int contadorJogosAction = 0;
                
        while (linha != null)
        {
            String[] valores = linha.split(";");

            String ano = valores[8];

            Stats estatisticas;
            if (dicionario.containsKey(ano))
            {
                estatisticas = dicionario.get(ano);
            } else
            {
                estatisticas = new Stats();
                estatisticas.setPior_jogo(valores[2]);
            }

            contadorReviews++;
            mediaReviews += Double.parseDouble(valores[5]);
            
            //estatisticas.ano = Integer.parseInt(valores[8]);
            //estatisticas.num_reviews++;
            estatisticas.setNum_reviews(estatisticas.getNum_reviews() + 1);
            
            if (valores[7].compareTo("Y") == 0)
            {
                //estatisticas.num_editor_choice++;
                estatisticas.setNum_editor_choice(estatisticas.getNum_editor_choice() + 1);
            }
            if (valores[1].compareTo("Amazing") == 0 || valores[1].compareTo("Masterpiece") == 0)
            {
                //estatisticas.num_amazing++;
                estatisticas.setNum_amazing(estatisticas.getNum_amazing() + 1);
            }
            //estatisticas.total_scores += Double.parseDouble(valores[5]);
            estatisticas.setTotal_scores(estatisticas.getTotal_scores() + Double.parseDouble(valores[5]));

            //estatisticas.lista_scores.add(Double.parseDouble(valores[5]));
            ArrayList<Double> lista_scores = estatisticas.getLista_scores();
            lista_scores.add(Double.parseDouble(valores[5]));
            estatisticas.setLista_scores(lista_scores);

            if (Double.parseDouble(valores[5]) > estatisticas.nota_melhor_jogo)
            {
                //estatisticas.melhor_jogo = valores[2];
                estatisticas.setMelhor_jogo(valores[2]);
            }

            if (Double.parseDouble(valores[5]) < estatisticas.nota_pior_jogo)
            {
                //estatisticas.pior_jogo = valores[2];
                estatisticas.setPior_jogo(valores[2]);
            }

            dicionario.put(ano, estatisticas);

            linha = leitor.lerLinha();
        }

        double desvioPadrao = 0;
        double scores = 0;
        int i = 0;
        
        //System.out.println(dicionario.get("2012"));
        for (String ano : dicionario.keySet())
        {
            Stats e = dicionario.get(ano);
            double num_amazing = e.getNum_amazing();
            double num_reviews = e.getNum_reviews();
            double total_scores = e.getTotal_scores();
            
            System.out.print("Ano: " + ano);
            System.out.print("| Número reviews: " + num_reviews);
            System.out.print("| Percent Amazing ou Masterpiece: " + (num_amazing/num_reviews) * 100);
            System.out.print("| Media Scores: " + total_scores/num_reviews);
            System.out.print("| Desvio padrão scores: " + desvioPadrao(e.getLista_scores()));
            desvioPadrao += desvioPadrao(e.getLista_scores());
            
            System.out.print("| Melhor Jogo: " + e.getMelhor_jogo());
            System.out.println("| Pior Jogo: " + e.getPior_jogo());
        }


        leitor.fechar();
    }
}
