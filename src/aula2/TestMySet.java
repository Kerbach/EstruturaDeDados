package aula2;

public class TestMySet
{
    public static void main(String[] args)
    {
        MySet set1 = new MySet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.remove("c");
        
        System.out.println("MySet 1: "+set1);

        MySet set2 = new MySet();
        set2.add("a");
        set2.add("d");
        set2.add("e");
        set2.add(set1);
        
        System.out.println("\nMySet 2: "+set2);
        
        MySet set3 = MySet.union(set1, set2);
        System.out.println("\nMySet 3: "+set3);
        
        
        MySet set4 = MySet.intersection(set1, set2);
        System.out.println("\nMySet 4: "+set4);
    }
}

