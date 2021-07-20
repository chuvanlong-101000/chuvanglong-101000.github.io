import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( true ) {
            System.out.println(" Bạn hãy nhập Q hoặc X để thoát chương trình.");
            String a = sc.nextLine();
            if (a.equals("Q") || a.equals("X")) {
                break;
            }else{
                boolean check = true;
                int b = Integer.parseInt(a);
                for ( int i = 2 ; i < b-1 ;i++){
                    if( b % 1 == 0) {
                        check = false;
                        System.out.println("Đây không phải số nguyên tố ");
                        break;
                    }else{
                        check = true ;
                        System.out.println("Là số nguyên tố ");
                        break;
                    }
                }
            }
        }        
    }
}