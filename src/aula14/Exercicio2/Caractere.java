package aula14.Exercicio2;

public class Caractere implements Comparable<Caractere>
{

    private char caracter;
    private int count;

    public Caractere(char caracter, int count)
    {
        this.caracter = caracter;
        this.count = count;
    }

    public int compareTo(Caractere c)
    {
        if (this.count != c.count)
        {
            return (c.count - this.count);
        }
        return (this.count - c.count);
    }

    public String toString()
    {
        return ("[" + this.caracter + " " + this.count + "]");
    }
}
