/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class QuestaoTres
{

    /*
    03. Parse the file below, which lists 1000 packages from a post office,
    where each line indicates the postal code of the destination followed by the cost of shipping.
    You need to identify which and how many different destinations are present in the list.
    
    03. Analise o arquivo abaixo, que lista 1000 pacotes de uma agência postal, 
    onde cada linha indica o código postal do destino seguido pelo custo do frete. 
    Você precisa identificar quais e quantos destinos diferentes estão presentes na lista.
     */
    public static void main(String[] args)
    {
        ArrayList<String> cep = new ArrayList();

        // Expressão regular para encontrar emails válidos
        Pattern pattern = Pattern.compile("[0-9]{5}-\\d{3}");

        // Arquivo de log que contém (ao que parece) 16455 emails
        ArquivoLeitura arquivoLeitura = new ArquivoLeitura("packages.txt");

        int contador = 0;
        String linha = arquivoLeitura.lerLinha();

        while (linha != null)
        {
            contador++;
            // Conteúdo da linha a ser carrida
            Matcher matcher = pattern.matcher(linha);
            
            while (matcher.find())
            {
                String cepEncontrado = matcher.group();
                System.out.println("Cep encontrado = " + cepEncontrado);
                // Verifica se é o primeiro
                if (cep.isEmpty())
                {
                    cep.add(cepEncontrado);
                }
                else
                {
                    boolean podeAdicionar = true;
                    // Verificar se o email já está no Array
                    for (int i = 0; i < cep.size(); i++)
                    {
                        if (cep.get(i).equalsIgnoreCase(cepEncontrado))
                        {
                            podeAdicionar = false;
                        }
                    }
                    if (podeAdicionar)
                    {
                        cep.add(cepEncontrado);
                    }
                }
            }
            linha = arquivoLeitura.lerLinha();
        }
        arquivoLeitura.fechar();

        System.out.println("Número de linhas: " + contador);
        System.out.println("Quantidade de CEPs destinos: " + cep.size());
        System.out.println("Os CEPs: " + cep);
    }

}
