package aula16;

public class BatchMerge
{

    public static void main(String[] args)
    {
        MyReader read1 = new MyReader("src\\aula16\\partial-1.txt");
        MyReader read2 = new MyReader("src\\aula16\\partial-2.txt");
        MyWriter wrt   = new MyWriter("src\\aula16\\sorted.txt");

        String string1 = read1.readLine();
        String string2 = read2.readLine();

        while (string1 != null || string2 != null)
        {
            if (string1 == null)
            {
                wrt.writeLine(string2);
                string2 = read2.readLine();
            } else if (string2 == null)
            {
                wrt.writeLine(string1);
                string1 = read1.readLine();
            } else if (Integer.parseInt(string1) < Integer.parseInt(string2))
            {
                wrt.writeLine(string1 + "");
                string1 = read1.readLine();
            } else if (Integer.parseInt(string1) >= Integer.parseInt(string2))
            {
                wrt.writeLine(string2 + "");
                string2 = read2.readLine();
            }
        }
        wrt.close();
        read1.close();
        read2.close();
    }
}
