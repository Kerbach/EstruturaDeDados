package aula14.Exercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Exercicio4
{

    // TESTE COM COMIT - GUSTAVO
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        TreeMap<String, Double> ceps = new TreeMap<String, Double>();

        FileReader fileReader = new FileReader("packages.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = bufferedReader.readLine();
        while (bufferedReader.ready())
        {
            String[] cep = linha.split(" ");

            if (ceps.containsKey(cep[0]))
            {
                ceps.put(cep[0], ceps.get(cep[0]) + Double.parseDouble(cep[1]));
            } 
            else
            {
                ceps.put(cep[0], Double.parseDouble(cep[1]));
                //System.out.println(cep[0] +" "+ Double.parseDouble(cep[1]));
            }

            linha = bufferedReader.readLine();
        }

        ArrayList<Cep> arrayCeps = new ArrayList<Cep>();

        for (String k : ceps.keySet())
        {
            arrayCeps.add(new Cep(k, ceps.get(k)));
        }

        Collections.sort(arrayCeps);
        System.out.println(arrayCeps);
    }

}
