package aula16;

import java.io.*;

public class MyReader
{

    private BufferedReader buffRead;

    public MyReader(String filename)
    {
        FileReader fileReader = null;
        try
        {
            fileReader = new FileReader(filename);
            buffRead = new BufferedReader(fileReader);
        } catch (FileNotFoundException e)
        {
            System.err.println("Error opening file: " + filename);
        }
    }

    public String readLine()
    {
        try
        {
            if (buffRead != null)
            {
                return buffRead.readLine();
            }
        } catch (IOException e)
        {
            System.err.println("Error reading from file!");
        }
        return null;
    }

    public void close()
    {
        try
        {
            if (buffRead != null)
            {
                buffRead.close();
            }
        } catch (IOException e)
        {
            System.err.println("Error closing file!");
        }
        buffRead = null;
    }
}
