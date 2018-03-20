package aula2;


import java.util.*;

public class MySet
{
    protected ArrayList<String> array;

    // default constructor
    public MySet()
    {
        this.array = new ArrayList<String>();
    }

    //copy constructor
    public MySet(MySet set)
    {
        this.array = new ArrayList<String>();
        add(set);
    }

    public void add(String s)
    {
        this.array.add(s);
    }

    public void add(MySet set)
    {
        for (String s : set.array)
        {
            /*this.array.*/ add(s);
        }
    }

    public void remove(String s)
    {
        this.array.remove(s);
    }

    public int size()
    {
        return this.array.size();
    }

    public String toString()
    {
        return this.array.toString();
    }
    
    public static MySet union(MySet set1, MySet set2)
    {
        MySet set3 = new MySet(set1);
        set3.add(set2);
        return set3;
    }
    
    public static MySet intersection (MySet set1, MySet set2)
    {  
        MySet set3 = new MySet();
        
        for (String s : set1.array)
        {
            if (set2.array.contains(s))
            {
                set3.add(s);
            }
        }
        return set3;
    }
}
