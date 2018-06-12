package aula14.Exercicio3;

public class Cep implements Comparable<Cep>
{
    private String cep;
    private int count;

    public Cep(String cep, int count)
    {
        this.cep = cep;
        this.count = count;
    }

    public int compareTo(Cep c)
    {
        if (this.count != c.count)
        {
            return (c.count - this.count);
        }
        return (this.count - c.count);
    }

    public String toString()
    {
        return ("[" + this.cep + " " + this.count + "]");
    }
}
