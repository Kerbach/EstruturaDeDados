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
public class TestMyFileReader
{
    public static void main(String[] args)
    {
        MyFileReader f = new MyFileReader("input.txt");
        String s;
        int i = 0;
        s = f.readLine();
        while (s != null)
        {
            System.out.println(i + ": " + s);
            i = i + 1;
            s = f.readLine();
        }
        f.close();
    }
}

