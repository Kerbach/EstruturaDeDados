package aula16;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class ListingRedux
{

    public List<File> sortByDate(List<File> files)
    {
        Collections.sort(files, (File obj1, File obj2) ->
        {
            if (obj1.lastModified() == obj2.lastModified())
            {
                return obj1.getName().compareTo(obj2.getName());
            }
            return Long.compare(obj1.lastModified(), obj2.lastModified());
        });
        return files;
    }

    public List<File> sortBySize(List<File> files)
    {
        Collections.sort(files, (File o1, File o2) ->
        {
            if (o1.length() == o2.length())
            {
                return o1.getName().compareTo(o2.getName());
            }
            return Long.compare(o1.length(), o2.length());
        });
        return files;
    }
}
