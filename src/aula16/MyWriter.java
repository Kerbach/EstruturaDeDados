package aula16;

import java.io.*;

class MyWriter
{
    private BufferedWriter buffwhr;

    public MyWriter(String nome)
    {
        FileWriter file = null;
        try
        {
            file = new FileWriter(nome);
            buffwhr = new BufferedWriter(file);
        } catch (IOException e)
        {
            System.err.println("Cannot write to file: " + nome);
        }
    }

    public void writeLine(String line)
    {
        try
        {
            if (buffwhr != null)
            {
                buffwhr.write(line + "\n");
            }
        } catch (IOException e)
        {
            System.err.println("Error writing to file!");
        }
    }

    public void close()
    {
        try
        {
            if (buffwhr != null)
            {
                buffwhr.close();
            }
        } catch (IOException e)
        {
            System.err.println("Error closing file!");
        }
        buffwhr = null;
    }
}
