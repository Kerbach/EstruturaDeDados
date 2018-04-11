/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author wrkerber
 */
import java.util.ArrayList;

public class MyDictionary
{
    private class Item
    {
        public String key;
        public int    value;
        public Item(String k, int v)
        {
            this.key = k;
            this.value = v;
        }
    }

    private ArrayList<Item> array;

    public MyDictionary()
    {
        array = new ArrayList<Item>();
    }

    public void put(String k, int v)
    {
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i).key == k) 
            {
                array.get(i).value = v;
                return;
            }
        }
        array.add(new Item(k, v));
    }

    public int get(String k)
    {
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i).key == k) 
            {
                return array.get(i).value;
            }
        }
        return 0xBebaCafe; // melhor seria gerar uma exception
    }

    public static void main(String[] args)
    {
        MyDictionary dict = new MyDictionary();
        dict.put("abc", 123);
        dict.put("def", 456);    
        dict.put("abc", 789);
        System.out.println("[abc]=" + dict.get("abc"));
        System.out.println("[def]=" + dict.get("def"));
    }
}
