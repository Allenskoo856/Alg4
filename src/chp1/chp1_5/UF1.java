package chp1.chp1_5;

import edu.princeton.cs.algs4.UF;


/**
 * @author : Administrator
 * @create 2018-12-26 21:01
 */
public class UF1 {
    private int[] id;
    private int count;

    public UF1(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
    }
}
