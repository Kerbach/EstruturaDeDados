package aula14;

public class Domino implements Comparable<Domino>
{

    private int a, b;

    public Domino(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int compareTo(Domino d)
    {
        if (this.a != d.a)
        {
            return (this.a - d.a);
        }
        return (this.b - d.b);
    }

    public String toString()
    {
        return ("[" + this.a + " " + this.b + "]");
    }
}
