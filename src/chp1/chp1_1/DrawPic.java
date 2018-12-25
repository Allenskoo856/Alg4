package chp1.chp1_1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author : Administrator
 * @create 2018-12-21 16:03
 */
public class DrawPic {

    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        for (int i = 0; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }
}
