package aula16;

public class ListingTest
{

    public static void main(String[] args)
    {
        Listing e = new Listing("src\\aula16");
        e.listByDate();
        System.out.println("\n\n");
        e.listBySize();
    }
}
