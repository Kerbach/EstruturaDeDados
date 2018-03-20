package aula2;


public class MySetUnique extends MySet
{
    /**
     *
     * @param s
     */
    @Override
    public void add(String s)
    {
        if (!this.array.contains(s))
        {
            this.array.add(s);
        }
    }
}
