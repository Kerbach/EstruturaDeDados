package aula2;

public class TestMyDeque
{
    public static void main(String[] args) throws Exception
    {
        MyDeque deque1 = new MyDeque();
        deque1.add(1);
        deque1.add(2);
        deque1.addFirst(3);
        deque1.addFirst(4);
        
        System.out.println("stack=" + deque1);
        System.out.println("size=" + deque1.size());
        
        try
        {
            System.out.println("first=" + deque1.first());
            System.out.println("last=" + deque1.last());
            System.out.println("Remove: " + deque1.remove());
            System.out.println("stack=" + deque1);
            System.out.println("Remove: " + deque1.remove());
            System.out.println("stack=" + deque1);
            System.out.println("RemoveLast: " + deque1.removeLast());
            System.out.println("stack=" + deque1);
            System.out.println("RemoveLast: " + deque1.removeLast());
            System.out.println("stack=" + deque1);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

