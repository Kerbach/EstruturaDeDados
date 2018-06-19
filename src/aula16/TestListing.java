package aula16;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestListing
{
    public static void main(String[] args)
    {
        File directory = new File("src\\lista2");
        File[] files = directory.listFiles();
        List<File> f = new ArrayList();
        f.addAll(Arrays.asList(files));

        ListingRedux line = new ListingRedux();
        Date dt;
        for (int i = 0; i < f.size(); i++)
        {
            dt = new Date(line.sortByDate(f).get(i).lastModified());
            System.out.println(" Name: " + line.sortByDate(f).get(i).getName() + " || Date: " + dt);
        }
        System.out.println("");
        for (int i = 0; i < f.size(); i++)
        {
            System.out.println(" Name: " + line.sortBySize(f).get(i).getName() + " || Size: " + line.sortBySize(f).get(i).length() + " bytes. ");
        }
    }
}
