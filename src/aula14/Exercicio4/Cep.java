package aula14.Exercicio4;

public class Cep implements Comparable<Cep>
{

    private String cep;
    private double sum;

    public Cep(String cep, double sum)
    {
        this.cep = cep;
        this.sum = sum;
    }

    public int compareTo(Cep c)
    {
        if (this.sum != c.sum)
        {
            return (int) (c.sum - this.sum);
        }
        return (int) (this.sum - c.sum);
    }

    public String toString()
    {
        return ("[" + this.cep + " " + this.sum + "]");
    }
}
