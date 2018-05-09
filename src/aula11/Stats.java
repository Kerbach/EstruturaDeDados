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
    public int ano = 0;
    public int num_reviews = 0;
    public int num_editor_choice = 0;
    public int num_amazing = 0;
    public double total_scores = 0;
    public double media_scores = 0;
    public ArrayList<Double> lista_scores;
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
