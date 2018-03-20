package aula2;

public class TestMyStack
{
    public static void main(String[] args) throws Exception
    {
        MyStack stack1 = new MyStack();
        stack1.push(0);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(6);
        
        System.out.println("stack=" + stack1);
        
        try
        {
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
        } catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("size=" + stack1.size());
        System.out.println("stack=" + stack1);
    }
}

