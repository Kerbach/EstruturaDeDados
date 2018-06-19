package aula16;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Listing
{

    ArrayList<File> array_file;

    public Listing(String directory)
    {
        array_file = new ArrayList<File>();
        File[] vector_file = new File(directory).listFiles();
        for (int x = 0; x <= vector_file.length - 1; x++)
        {
            array_file.add(vector_file[x]);
        }
    }

    public void listOriginal()
    {
        Collections.sort(array_file);
        System.out.println(array_file);
    }

    public void listByDate()
    {
        Collections.sort(array_file, new ListByDate());
        for (File file : array_file)
        {
            System.out.println(file.getName() + " - modified: " + (new Date(file.lastModified()).toString()));
        };
    }

    public void listBySize()
    {
        Collections.sort(array_file, new ListBySize());
        for (File file : array_file)
        {
            System.out.println(file.getName() + " - size: " + file.length());
        }
    }
}
