package aula14.Exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class Exercicio3
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        HashMap<String, Integer> ceps = new HashMap<String, Integer>();

        FileReader fileReader = new FileReader("packages.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = bufferedReader.readLine();
        while (bufferedReader.ready())
        {
            String[] cep = linha.split(" ");

            if (ceps.containsKey(cep[0]))
            {
                ceps.put(cep[0], ceps.get(cep[0]) + 1);
            } else
            {
                ceps.put(cep[0], 1);
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
