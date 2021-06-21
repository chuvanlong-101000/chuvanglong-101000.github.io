package btvn;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi vào :");
        String str = sc.nextLine();
        int i = 0 ;
        int j = str.length()-1;
        boolean t = true;
        while ( i < j ){
            if ( str.charAt(i)!= str.charAt(j)) {
                t = false;
                break;
            }
            i++;
            j--;
        }
        if(t) {
            System.out.println("Dãy là chuỗi cân bằng");
        } else {
            System.out.println("Dãy không phải là chuỗi cân bằng");
        }

    }
}
