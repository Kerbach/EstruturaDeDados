package aula16;

import java.util.HashSet;

public class QuestaoUm {

    public static boolean binarySearch(int[] v, int inicio, int num, int fim) {
        int middle = (inicio + fim) / 2;

        if (inicio > fim) {
            return false;
        } else if (v[middle] == num) {
            return true;
        } else if (v[middle] < num) {
            return binarySearch(v, middle + 1, num, fim);
        } else if (v[middle] > num) {
            return binarySearch(v, inicio, num, middle - 1);
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < size - 1; i++) {
            array[i] = i + 1;
            hs.add(i + 1);
        }

        int trials = 100000;
        System.out.println("data size : " + size + " integers");
        System.out.println("searches  : " + trials);

        long start = System.currentTimeMillis();
        for (int i = 0; i < trials; i++) {
            int r = (int) (Math.random() * size) + 1;
            binarySearch(array, 0, r, array.length - 1);
        }
        System.out.println("binary    :  " + (System.currentTimeMillis() - start) / 1000.0 + " s");
    }

}
