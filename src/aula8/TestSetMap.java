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
import java.util.*;

public class TestSetMap
{
    public static void main(String[] args) throws Exception
    {
        HashSet <Integer> ts = new HashSet <Integer>();
        
        ts.add(37);
        ts.add(68);
        ts.add(14);
        for (int e : ts)
        {
            System.out.println(e);
        }

        TreeMap <Integer,String> hm = new TreeMap <Integer,String>();
        
        hm.put(37, "yesterday");
        hm.put(68, "today");
        hm.put(14, "tomorrow");
        for (int k : hm.keySet())
        {
            System.out.println(hm.get(k));
        }
    }
}
