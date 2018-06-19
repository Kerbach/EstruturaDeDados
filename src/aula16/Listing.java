package aula16;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Listing
{

    ArrayList<File> array_arq;

    public Listing(String directory)
    {
        array_arq = new ArrayList<File>();
        File[] vetor_arq = new File(directory).listFiles();
        for (int x = 0; x <= vetor_arq.length - 1; x++)
        {
            array_arq.add(vetor_arq[x]);
        }
    }

    public void listOriginal()
    {
        Collections.sort(array_arq);
        System.out.println(array_arq);
    }

    public void listByDate()
    {
        Collections.sort(array_arq, new ListByDate());
        for (File file : array_arq)
        {
            System.out.println(file.getName() + " - modificado: " + (new Date(file.lastModified()).toString()));
        };
    }

    public void listBySize()
    {
        Collections.sort(array_arq, new ListBySize());
        for (File file : array_arq)
        {
            System.out.println(file.getName() + " - tamanho: " + file.length());
        }
    }
}
