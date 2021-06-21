package btvn;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String[]a={"fuck","damn","sex","rape","shit","bitch"};
        
        System.out.println("Hãy nhập chuỗi:");
        String  str=sc.nextLine();
        int i=0;
        while (i<a.length) {
            if (str.contains(a[i])) {
                str=str.replace(a[i], "***");
            }
            i++;
        }
        System.out.println(str);
       
      }
}
