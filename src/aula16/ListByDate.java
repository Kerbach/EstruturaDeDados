package aula16;

import java.io.File;
import java.util.Comparator;

public class ListByDate implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        File arq1 = (File) o1;
        File arq2 = (File) o2;
        if (arq1.lastModified() == arq2.lastModified())
        {
            if (arq1.getName().compareTo(arq2.getName()) > 0)
            {
                return 1;
            } else
            {
                return -1;
            }
        } else if (arq1.lastModified() > arq2.lastModified())
        {
            return 1;
        } else
        {
            return -1;
        }
    }
}
