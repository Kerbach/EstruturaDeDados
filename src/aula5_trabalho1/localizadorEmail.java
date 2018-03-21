/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5_trabalho1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wrkerber
 */
public class localizadorEmail
{
    public static void main(String[] args)
    {
        ArrayList<String> email = new ArrayList();
        
        // Expressão regular para encontrar emails válidos
        Pattern pattern = Pattern.compile("([\\w._-]+@[\\w.]+)");
        
        // Arquivo de log que contém (ao que parece) 16455 emails
        ArquivoLeitura arquivoLeitura = new ArquivoLeitura("log.txt");
        
        int contador = 1;
        String linha = arquivoLeitura.lerLinha();
        
        while (linha !=  null)
        {
            contador++;
            // Conteúdo da linha a ser carrida
            Matcher matcher = pattern.matcher(linha);

            while (matcher.find()) 
            {
                String emailEncontrado = matcher.group();
                
                // Verifica se é o primeiro
                if (email.isEmpty())
                {
                    email.add(emailEncontrado);
                }
                else
                {
                    boolean podeAdicionar = true;
                    // Verificar se o email já está no Array
                    for (int i = 0; i < email.size(); i++)
                    {
                        if (email.get(i).equalsIgnoreCase(emailEncontrado))
                        {
                            podeAdicionar = false;
                        }
                    }
                    if (podeAdicionar)
                    {
                        email.add(emailEncontrado);
                    }
                }
            }
            linha = arquivoLeitura.lerLinha();
        }
        arquivoLeitura.fechar();
        
        System.out.println("Número de linhas: " + contador);
        System.out.println("Emails únicos: " + email.size());
    }
    
}
