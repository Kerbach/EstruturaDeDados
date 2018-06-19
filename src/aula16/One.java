package aula16;

public class One
{

    public static void main(String[] args)
    {
        int[] numbers = new int[250];
        for (int x = 0; x < 250; x++)
        {
            numbers[x] = x;
        }
        System.out.println(binarySearch(numbers, 251, 0, 249, 0));
    }

    public static int binarySearch(int[] aux, int n, int start, int end, int c)
    {
        if (start <= end)
        {
            int middle = (start + end) / 2;

            if (aux[middle] == n)
            {
                return n;
            }
            c++;
            int r;

            if (aux[middle] < n)
            {
                r = binarySearch(aux, n, (middle + 1), end, c++);
            } else
            {
                r = binarySearch(aux, n, start, (middle - 1), c++);
            }
            return r;
        } else
        {
            return 0;
        }
    }
}
