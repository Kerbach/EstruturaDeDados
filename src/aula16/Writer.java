package aula16;

import java.io.*;

class Writer
{
    private BufferedWriter buffwhr;

    public Writer(String filename)
    {
        FileWriter file = null;
        try
        {
            file = new FileWriter(filename);
            buffwhr = new BufferedWriter(file);
        } catch (IOException e)
        {
            System.err.println("Cannot write to file: " + filename);
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
