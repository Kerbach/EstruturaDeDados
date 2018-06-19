package aula16;

import java.util.ArrayList;
import java.util.Collections;

public class BatchSort
{

    public static void main(String[] args)
    {
        ArrayList<Integer> array1 = readTxtNumber("src\\lista2\\numbers-1.txt");
        Collections.sort(array1);
        writeTxt("src\\lista2\\partial-1.txt", array1);

        ArrayList<Integer> array2 = readTxtNumber("src\\lista2\\numbers-2.txt");
        Collections.sort(array2);
        writeTxt("src\\lista2\\partial-2.txt", array2);

    }

    public static ArrayList<Integer> readTxtNumber(String address)
    {
        Reader myReader = new Reader(address);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        String aux = myReader.readLine();
        while (aux != null)
        {
            array1.add(Integer.parseInt(aux));
            aux = myReader.readLine();
        }
        myReader.close();
        return array1;
    }

    public static void writeTxt(String address, ArrayList array1)
    {
        Writer myWriter = new Writer(address);
        for (int i = 0; i < array1.size(); i++)
        {
            myWriter.writeLine(array1.get(i) + "");
        }
        myWriter.close();
    }
}
