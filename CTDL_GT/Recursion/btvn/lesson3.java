package Recursion.btvn;

public class lesson3 {
    public static int find(int[] a, int x, int i) {
        int n=a.length-1;

        if (i > n) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        if (a[n] == x) {
            return n;
        }
        return find(a, x, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        //System.out.println(find(a,9,a.length-1));
    }

}
