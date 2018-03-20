package aula2;


import java.util.*;

public class MyQueue
{

    ArrayList<Integer> array;

    public MyQueue()
    {
        this.array = new ArrayList<Integer>();
    }

    public void add(int i)
    {
        this.array.add(i);
    }

    public int remove() throws Exception
    {
        if (size() != 0)
        {
            return this.array.remove(0);
        } else
        {
            throw new Exception("empty queue");
        }
    }

    public int first() throws Exception
    {
        if (size() != 0)
        {
            return this.array.get(0);
        } else
        {
            throw new Exception("empty queue");
        }
    }

    public int size()
    {
        return this.array.size();
    }

    public String toString()
    {
        return this.array.toString();
    }
}
