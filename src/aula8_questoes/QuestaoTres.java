package aula8_questoes;

import aula8.ArquivoLeitura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class QuestaoTres
{

    /*
    03. Analise o arquivo abaixo, que lista 1000 pacotes de uma agência postal, 
    onde cada linha indica o código postal do destino seguido pelo custo do frete. 
    Você precisa identificar quais e quantos destinos diferentes estão presentes na lista.
    
    03. Parse the file below, which lists 1000 packages from a post office,
    where each line indicates the postal code of the destination followed by the cost of shipping.
    You need to identify which and how many different destinations are present in the list.
     */
    private ArrayList string;
    private HashMap strings = new HashMap();

    public HashMap postalCode(ArrayList<String> linhas)
    {
        this.string = linhas;
        for (int i = 0; i < string.size(); i++)
        {
            String code = string.get(i).toString().substring(0, 9);
            if (strings.containsKey(code))
            {
                strings.put(code, Integer.parseInt(strings.get(code).toString()) + 1);
            } else
            {
                strings.put(code, 1);
            }
        }
        return strings;
    }
}
