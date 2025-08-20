import java.util.Arrays;

class tester {
    public static void main(String[] args) {
        var a = 4;
        System.out.println("pre decr : " + (++a));
        // ++a <= a = a+1
        System.out.println(a);
        System.out.println("-----------");
        var b = 3;
        System.out.println("post decr : " + (b++));
        System.out.println(b);
        System.out.println(b);
        System.out.println("-----------");
        int[] aa = { 1, 2, 3 };
        System.out.println(aa.hashCode());
        int[] bb = aa;
        System.out.println(bb.hashCode());
        int[] cc = aa.clone();
        bb[0] = 5;
        System.out.println(cc.hashCode());
        System.out.println(aa[0]);
        System.out.println(bb[0]);
        System.out.println(cc[0]);
        System.out.println("-----------");
        short z = (short) 200;
        System.out.println(z);
        System.out.println("-----------");
        double[] suhu = new double[3];
        suhu[0] = 36.5;
        suhu[1] = 37.1;
        suhu[2] = 38.0;
        // suhu[3] = 345345;
        System.out.println("-----------");
        double[] newSuhu = { 36.51, 37.1, 38.0 };
        System.out.println("suhu ke-0 : " + newSuhu[0]);
        System.out.println("-----------");
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matrix[0]);
        System.out.println(matrix[1][1]);
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("-----------");
        int[][][] matrix3d = {
                { { 1, 2, 3 }, { 10 } },
                { { 4, 5, 6 }, { 11 } },
                { { 7, 8, 9 }, { 12 } }
        };
        System.out.println(matrix3d[2][1][0]); // 12
        System.out.println(matrix3d[0][1][0]);// 10
        System.out.println(matrix3d[1][0][2]); // 6
    }
}