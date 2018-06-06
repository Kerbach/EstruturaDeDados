package aula14;

/**
 *
 * @author Usuario
 */
public class Pessoa implements Comparable<Pessoa>
{
    String nome;
    String sobrenome;
    int idade;

    public Pessoa(String nome, String sobrenome, int idade)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String toString()
    {
        return ("[" + this.nome + " , " + this.sobrenome + " , " + this.idade + "]");
    }

    @Override
    public int compareTo(Pessoa p)
    {
        if (this.nome.compareTo(p.nome) != 0)
        {
            return this.nome.compareTo(p.nome);
        }
        else if (this.sobrenome.compareTo(p.sobrenome) != 0)
        {
            return this.sobrenome.compareTo(p.sobrenome);
        }
        else if (this.idade != p.idade)
        {
            return this.idade - p.idade;
        }
        else
        {
            return 0;
        }
    }
}
