package aula16;

public class Exercicio1
{

    public static void main(String[] args)
    {
        int[] numeros = new int[250];
        for (int x = 0; x < 250; x++)
        {
            numeros[x] = x;
        }
        System.out.println(binarySearch(numeros, 251, 0, 249, 0));
    }

    public static int binarySearch(int[] auxiliar, int n, int inicio, int fim, int c)
    {
        if (inicio <= fim)
        {
            int meio = (inicio + fim) / 2;

            if (auxiliar[meio] == n)
            {
                return n;
            }
            c++;
            int r;

            if (auxiliar[meio] < n)
            {
                r = binarySearch(auxiliar, n, (meio + 1), fim, c++);
            } else
            {
                r = binarySearch(auxiliar, n, inicio, (meio - 1), c++);
            }
            return r;
        } else
        {
            return 0;
        }
    }
}
