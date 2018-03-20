package aula2;

public class TestMySetUnique
{
    public static void main(String[] args)
    {
        MySet set1 = new MySetUnique();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("b");
        set1.add("e");
        System.out.println(set1);

        MySet set2 = new MySetUnique();
        set2.add("d");
        set2.add("e");
        set2.add(set1);
        System.out.println(set2);
        
    }
}

