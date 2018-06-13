package aula14.Exercicio4;

public class Cep implements Comparable<Cep>
{

    private String cep;
    private double soma;

    public Cep(String cep, double sum)
    {
        this.cep = cep;
        this.soma = sum;
    }

    public int compareTo(Cep c)
    {
        if (this.soma != c.soma)
        {
            return (int) (c.soma - this.soma);
        }
        return (int) (this.soma - c.soma);
    }

    public String toString()
    {
        return ("[" + this.cep + " " + this.soma + "]");
    }
}
