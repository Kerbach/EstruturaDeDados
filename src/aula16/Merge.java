package aula16;

public class Merge
{

    public static void main(String[] args)
    {
        Reader read1 = new Reader("src\\lista2\\partial-1.txt");
        Reader read2 = new Reader("src\\lista2\\partial-2.txt");
        Writer wrt = new Writer("src\\lista2\\sorted.txt");

        String s1 = read1.readLine();
        String s2 = read2.readLine();

        while (s1 != null || s2 != null)
        {
            if (s1 == null)
            {
                wrt.writeLine(s2);
                s2 = read2.readLine();
            } else if (s2 == null)
            {
                wrt.writeLine(s1);
                s1 = read1.readLine();
            } else if (Integer.parseInt(s1) < Integer.parseInt(s2))
            {
                wrt.writeLine(s1 + "");
                s1 = read1.readLine();
            } else if (Integer.parseInt(s1) >= Integer.parseInt(s2))
            {
                wrt.writeLine(s2 + "");
                s2 = read2.readLine();
            }
        }
        wrt.close();
        read1.close();
        read2.close();
    }
}
