import java.util.*;

public class TestInsertion
{
    public static void main(String[] args) throws Exception
    {
        int i, n = 1000000;
        long start;
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println("Time for " + n + " insertions at end (in seconds)");

        start = System.currentTimeMillis();        
        for (i = 0; i < n; i++)
        {
            array.add(i);
        }
        System.out.println("  ArrayList:  " + (System.currentTimeMillis() - start) / 1000.0);

        start = System.currentTimeMillis();
        for (i = 0; i < n; i++)
        {
            list.add(i);
        }
        System.out.println("  LinkedList: " + (System.currentTimeMillis() - start) / 1000.0);   

        array.clear();
        list.clear();
        System.out.println("Time for " + n + " insertions at beginning (in seconds)");

        start = System.currentTimeMillis();
        for (i = 0; i < n; i++)
        {
            array.add(0, i);
        }
        System.out.println("  ArrayList:  " + (System.currentTimeMillis() - start) / 1000.0);

        start = System.currentTimeMillis();
        for (i = 0; i < n; i++)
        {
            list.add(0, i);
        }
        System.out.println("  LinkedList: " + (System.currentTimeMillis() - start) / 1000.0);
    }
}