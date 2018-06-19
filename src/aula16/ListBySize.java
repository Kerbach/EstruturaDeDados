package aula16;

import java.io.File;
import java.util.Comparator;

public class ListBySize implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        File arq1 = (File) o1;
        File arq2 = (File) o2;
        if (arq1.length() == arq2.length())
        {
            return arq1.getName().compareTo(arq2.getName());
        } else if (arq1.length() > arq2.length())
        {
            return 1;
        } else
        {
            return -1;
        }
    }
}
