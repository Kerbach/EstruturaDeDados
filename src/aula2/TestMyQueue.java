package aula2;

public class TestMyQueue
{
    public static void main(String[] args) throws Exception
    {
        MyQueue queue1 = new MyQueue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        
        System.out.println("stack=" + queue1);
        
        try
        {
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            System.out.println("stack=" + queue1);
            queue1.add(0);
            queue1.add(1);
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            System.out.println("Remove: "+queue1.remove());
            
        } catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("size=" + queue1.size());
        System.out.println("stack=" + queue1);
    }
}

