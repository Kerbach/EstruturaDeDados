/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.util.ArrayList;

/**
 *
 * @author wrkerber
 */
public class Stats
{
    private int ano = 0;
    private int num_reviews = 0;
    private int num_editor_choice = 0;
    private int num_amazing = 0;
    private double total_scores = 0;
    private double media_scores = 0;
    
    private ArrayList<Double> lista_scores;

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getNum_reviews()
    {
        return num_reviews;
    }

    public void setNum_reviews(int num_reviews)
    {
        this.num_reviews = num_reviews;
    }

    public int getNum_editor_choice()
    {
        return num_editor_choice;
    }

    public void setNum_editor_choice(int num_editor_choice)
    {
        this.num_editor_choice = num_editor_choice;
    }

    public int getNum_amazing()
    {
        return num_amazing;
    }

    public void setNum_amazing(int num_amazing)
    {
        this.num_amazing = num_amazing;
    }

    public double getTotal_scores()
    {
        return total_scores;
    }

    public void setTotal_scores(double total_scores)
    {
        this.total_scores = total_scores;
    }

    public double getMedia_scores()
    {
        return media_scores;
    }

    public void setMedia_scores(double media_scores)
    {
        this.media_scores = media_scores;
    }

    public ArrayList<Double> getLista_scores()
    {
        return lista_scores;
    }

    public void setLista_scores(ArrayList<Double> lista_scores)
    {
        this.lista_scores = lista_scores;
    }

    public double getNota_melhor_jogo()
    {
        return nota_melhor_jogo;
    }

    public void setNota_melhor_jogo(double nota_melhor_jogo)
    {
        this.nota_melhor_jogo = nota_melhor_jogo;
    }

    public String getMelhor_jogo()
    {
        return melhor_jogo;
    }

    public void setMelhor_jogo(String melhor_jogo)
    {
        this.melhor_jogo = melhor_jogo;
    }

    public double getNota_pior_jogo()
    {
        return nota_pior_jogo;
    }

    public void setNota_pior_jogo(double nota_pior_jogo)
    {
        this.nota_pior_jogo = nota_pior_jogo;
    }

    public String getPior_jogo()
    {
        return pior_jogo;
    }

    public void setPior_jogo(String pior_jogo)
    {
        this.pior_jogo = pior_jogo;
    }

    public double getNum_jogos_action()
    {
        return num_jogos_action;
    }

    public void setNum_jogos_action(double num_jogos_action)
    {
        this.num_jogos_action = num_jogos_action;
    }

    public double getMedia_desvio_scores()
    {
        return media_desvio_scores;
    }

    public void setMedia_desvio_scores(double media_desvio_scores)
    {
        this.media_desvio_scores = media_desvio_scores;
    }
    public double nota_melhor_jogo = 0;
    public String melhor_jogo = "";
    public double nota_pior_jogo = 0;
    public String pior_jogo = "";
    public double num_jogos_action = 0;
    public double media_desvio_scores = 0;

    public Stats()
    {
        lista_scores = new ArrayList<Double>();
    }

}
