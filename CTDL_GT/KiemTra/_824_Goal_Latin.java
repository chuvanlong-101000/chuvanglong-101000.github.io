package KiemTra;
import java.util.HashSet;
public class _824_Goal_Latin {
    public static void main(String[] args) {
        String a = "I speak Goat Latin" ;
        System.out.println(toGoatLatin(a));
    }

    public static String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
    
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        String res = "";
        
        for(int i = 0; i < arr.length; i++){
            
            String str = arr[i];
            
            if(set.contains(str.charAt(0))){
                arr[i] += "ma";
            }else{
                String st = "";
                char c = str.charAt(0);
                st += str.substring(1);
                st += str.charAt(0);
                st += "ma";
                
                arr[i] = st;
            }              
            for(int j = 0; j <= i; j++){
               arr[i] += "a"; 
            }               
            res += arr[i] + " ";
        }
        return res.trim();
    }
}
