package aula8_questoes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author wrkerber
 */

/*
    04. Usando o mesmo arquivo, resolva o seguinte problema: você precisa somar
    valor dos pacotes para cada código postal distinto. Então o resultado para cada
    O código postal deve ser impresso na tela, em ordem crescente para os códigos.

    04. Using the same file, solve the following problem: you need to sum the 
    value of the packages for each distinct postal code. Then the result for each 
    postal code must be printed on the screen, in ascending order for the codes.
 */
public class QuestaoQuatro
{

    private ArrayList string;
    private HashMap strings = new HashMap();

    public HashMap postalCode(ArrayList<String> linhas)
    {
        this.string = linhas;
        for (int i = 0; i < string.size(); i++)
        {
            String code = string.get(i).toString().substring(0, 9);
            String value = string.get(i).toString().substring(12, 14);
            if (strings.containsKey(code))
            {
                strings.put(code, Double.parseDouble(strings.get(code).toString()) + value);
            } else
            {
                strings.put(code, Double.parseDouble(value));
            }
        }
        return strings;
    }
}
