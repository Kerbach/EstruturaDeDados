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
 * @author Usuario
 */
public class QuestaoQuatro {
    
    /*
    04. Using the same file, solve the following problem: you need to sum the value 
    of the packages for each distinct postal code. Then the result for each postal code
    must be printed on the screen, in ascending order for the codes.
    
    04. Usando o mesmo arquivo, resolva o seguinte problema: você precisa somar o valor 
    dos pacotes para cada código postal distinto. Em seguida, o resultado de cada código postal 
    deve ser impresso na tela, em ordem crescente para os códigos.  
     */
    public static void soma(String s) {

        Map<String, Integer> m = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i);
            if (m.containsKey(c)) {  // Testa se ja tem um valor dentro
                m.put(c, m.get(c) + 1);// se ja tiver apenas atualiza
            } else {
                m.put(c, 1);    // se nao tiver , adiciona
            }

        }
        System.out.println(m);
    }

    public static void main(String[] args) {

        // Arquivo de log que contém os CEPS.
        ArquivoLeitura arquivoLeitura = new ArquivoLeitura("packages.txt");

        //String valor;
        String c = arquivoLeitura.lerLinha();

        while (c != null) {

            c = c.substring(0, 9);

            soma(c);

            c = arquivoLeitura.lerLinha();
        }
    }
}
