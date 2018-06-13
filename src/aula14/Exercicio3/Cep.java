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
        if (this.cep.compareTo(c.cep) != 0)
        {
            return this.cep.compareTo(c.cep);
        }
        else if (this.count != c.count)
        {
            return this.count - c.count;
        }
        else
        {
            return 0;
        }
        
    }

    public String toString()
    {
        return ("[" + this.cep + " " + this.count + "]");
    }
}
