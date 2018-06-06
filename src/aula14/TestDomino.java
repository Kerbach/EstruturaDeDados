package aula14;

import java.util.*;

public class TestDomino
{

    public static void main(String[] args)
    {
        ArrayList<Integer> vi = new ArrayList<Integer>();
        vi.add(3);
        vi.add(7);
        vi.add(1);
        vi.add(5);
        vi.add(3);
        Collections.sort(vi);
        System.out.println(vi);

        /*ArrayList<String> vs = new ArrayList<String>();
        vs.add("hgjh"); vs.add("hgy"); vs.add("ffd"); vs.add("qca");
        Collections.sort(vs);
        System.out.println(vs);*/

 /*ArrayList<Domino> vd = new ArrayList<Domino>();
        vd.add(new Domino(3,6));
        vd.add(new Domino(4,4));
        vd.add(new Domino(1,2));
        vd.add(new Domino(3,1));
        Collections.sort(vd);
        System.out.println(vd);*/
    }
}
