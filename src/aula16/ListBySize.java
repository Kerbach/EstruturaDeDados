package aula16;

import java.io.File;
import java.util.Comparator;

public class ListBySize implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        File f1 = (File) o1;
        File f2 = (File) o2;
        if (f1.length() == f2.length())
        {
            return f1.getName().compareTo(f2.getName());
        } else if (f1.length() > f2.length())
        {
            return 1;
        } else
        {
            return -1;
        }
    }
}
