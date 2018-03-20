package aula2;

public class MyDeque extends MyQueue
{
    public void addFirst(int i)
    {
        array.add(0, i);
    }

    public int removeLast() throws Exception
    {
        return array.remove(size() - 1);
    }

    public int last() throws Exception
    {
        return array.get(size() - 1);
    }
}
