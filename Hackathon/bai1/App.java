import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Math math = new Math();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a = ");
        double a = sc.nextDouble();
        System.out.print("nhập b = ");
        double b = sc.nextDouble();
        System.out.print("nhập c = ");
        double c = sc.nextDouble();
        if (math.isTriangle(a, b, c)) {
          System.out.println("a : " + a + ", b : " + b + ", c : " + c + " tạo thành một tam giác");
        } else {
          System.out.println("a : " + a + ", b : " + b + ", c : " + c + " không tạo thành một tam giác");
        }
    }
}
