/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author wrkerber
 */
public class MyList
{
    private Node header;
    private int size;
    
    public Node first()
    {
        return this.header;
    }
    
    public int size() { return this.size; }
    
    public Node insertFirst(int e)
    {
        Node n = new Node(e, this.header);
        this.header = n;
        this.size++;
        return n;
    }
    
    public Node find(int e)
    {
        Node n = this.first();
        while (n != null)
        {
            if (n.element == e)
            {
                return n;
            }
            n = n.next;
        }
        return null;
    }
    
    @Override
    public String toString()
    {
        String s = "";
        Node n = first();
        while (n != null)
        {
            s += n.toString();
            n = n.next;
        }
        return s;
    }
}
