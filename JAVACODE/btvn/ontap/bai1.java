import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int m ,n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài : ");
        m = sc.nextInt();
        System.out.println("nhập chiều rộng :");
        n = sc.nextInt();
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if( i == 0 || j == 0 || i == m-1 || j == n-1) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
