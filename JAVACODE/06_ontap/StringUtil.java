import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringUtil {
    
    public boolean isContain( String strA , String strB){
    // sử dụng hàm có sẵn trong string   
        /*boolean result ;
        result = strA.contains(strB);       
        return result;
    }*/
    //  sử dụng hàm không có sẵn trong string  
        int i = 0 ; 
        int  j = 0 ;
        while( i < strA.length() &&  j < strB.length()){
            if( strA.charAt(i) ==  strB.charAt(j)) {
                i++;
            }
            if( strA.length() == i){
                return true;
            }
            j++;
        }
        return false;
    }

    /*
    Nghịch đảo một chuỗi: Hello -> olleH 
    */
    public  String reverse(){
        String orig;
        String rev="";
        Scanner s = new Scanner(System.in);
        System.out.println("nhập chuỗi cần đảo ngược : ");
        orig = s.nextLine();
        for(int i = orig.length()-1 ; i >= 0 ; i--){
            rev = rev + orig.charAt(i);
        }
        return rev;
    }

    
    /* trả về vị trí mà strB được tìm thấy trong strA
      -1: không tìm thấy
      >= 0: là  vị trí tìm thấy
    */
    public  int find(String strA, String strB) {
        int result=0;
        Scanner s = new Scanner(System.in);
        System.out.println("nhập chuỗi thứ nhất:");
        strA = s.nextLine();
        System.out.println("nhập chuỗi thứ 2 :");
        strB = s.nextLine();
        for(int i = 0 ; i < strB.length() ; i++){
           result = strA.indexOf(strB, i);
        }
        return result;
    }

    /* Upper case ký tự đầu tiên của từ */
    public String camelCase(String input) {
        String str[] = input.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) >= 97 && str[i].charAt(0) <= 122) {
                str[i] = str[i].replace(str[i].charAt(0), (char) (str[i].charAt(0) - 32));
            }
        }

        input = "";
        for (String i : str) {
            input += i + " ";
        }

        return input;
    }

     /*
     * "Không có gì quý hơn độc lập tự do" Từ dài nhất là "Không"
     */
    public String longestWord(String input) {
        input = input.replaceAll("[\\-\\+\\.\\^:,!@#\\$%&\\*_=\\?]", "");
        String str[] = input.split(" ");
        int pos = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[pos].length() < str[i].length()) {
                pos = i;
            }
        }
        return str[pos];
    }


    /*
     * Đếm số lần tự lặp lại
     */

    /*
     * "Một con mèo, hai con chó, chó đuổi mèo" Một: 1 con: 2 mèo: 2 hai: 1 chó: 2
     * đuổi: 1
     */
    public Map<String, Integer> countWords(String input) {
        input = input.replaceAll("[\\-\\+\\.\\^:,!@#\\$%&\\*_=\\?]", "");

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String str[] = input.split(" ");
        int count;
        for (int i = 0; i < str.length; i++) {
            count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (!map.containsKey(str[i])) {
                map.put(str[i], count);
            }
        }
        return map;
    }

}    