package aula16;

import java.util.ArrayList;
import java.util.Collections;

public class BatchSort
{

    public static void main(String[] args)
    {
        ArrayList<Integer> array1 = readTxtNumber("src\\aula16\\numbers-1.txt");
        Collections.sort(array1);
        writeTxt("src\\aula16\\partial-1.txt", array1);

        ArrayList<Integer> array2 = readTxtNumber("src\\aula16\\numbers-2.txt");
        Collections.sort(array2);
        writeTxt("src\\aula16\\partial-2.txt", array2);

    }

    public static ArrayList<Integer> readTxtNumber(String address)
    {
        MyReader read = new MyReader(address);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        String auxiliar = read.readLine();
        while (auxiliar != null)
        {
            array1.add(Integer.parseInt(auxiliar));
            auxiliar = read.readLine();
        }
        read.close();
        return array1;
    }

    public static void writeTxt(String endereco, ArrayList array)
    {
        MyWriter wtr = new MyWriter(endereco);
        for (int i = 0; i < array.size(); i++)
        {
            wtr.writeLine(array.get(i) + "");
        }
        wtr.close();
    }
}
