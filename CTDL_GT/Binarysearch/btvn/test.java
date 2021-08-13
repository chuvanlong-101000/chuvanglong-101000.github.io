package btvn;

import java.util.Arrays;

public class test {
    
    public static int searchName(String []a,String x,int left,int right) {
       
        if ( left > right ) {
            return -1;
        } 
        int mid = ( left + right ) / 2;
        if (x.equals(a[mid])) {
            return mid;
        }else if( x.compareTo(a[mid]) > 0) {
            return searchName(a, x, mid+1, right);
        }else {
            return searchName(a, x, left, mid-1);
        }
    }
    
    public static int searchNumber(int []a , int x , int left , int right) {
       
        if (left > right) {
            return -1;
        }        
        int mid = (left + right) / 2;
        if (a[mid] == x) {
            return mid;
        }else if(a[mid] < x){
            return searchNumber(a, x, mid+1, right);
        }else {
            return searchNumber(a, x, left, mid-1);
        }
    }
    public static void main(String[] args) {
        int n[]={0,1,2,3,4,5,6,7,8,9,10,11};
        String []a = {"Bui Giang Son",
                    "Le Van Phu",
                    "Duong Van Thang",
                    "Nguyen Cong Khanh",
                    "Nguyen Qung Tung",
                    "Chu Van Long",
                    "Le Van Tot",
                    "Nguyen Thanh Trung",
                    "Hoang Trong Khoa",
                    "Nguyen Minh An",
                    "Nguyen Viet Anh"};
        Arrays.sort(a);
        //Tìm kiếm theo stt
        int i = searchNumber(n, 0, 0, n.length-1);
        System.out.println("Họ và tên người bạn cần tìm là:"+ a[i]);
        //Tìm kiếm theo tên
        System.out.println(searchName(a, "Chu Van Long", 0, a.length-1));
    }
}
