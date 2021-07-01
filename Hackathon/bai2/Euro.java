import java.util.ArrayList;
import java.util.List;

public class Euro {
    public Long getFactorial( Integer number) {
        Long result = 1L;
        if( number == 0 || number == 1 ) {
            return result;
        }else{
            for( int i = 2 ; i <= number ; i++ ){
                result *= i;
            }
            return result;
        }
    }


    public void Euro( String[] team){
        List<String> a = new ArrayList<String>();
        Long socaptran = (getFactorial(team.length) / (getFactorial(team.length - 2)*getFactorial(2)));
        System.out.println(" Số cặp trận có thể sắp xếp : " +socaptran);
        for( int i = 1 ; i < team.length ; i++) {
            for( int j = 0 ; j < team.length ; j++) {
                if( !a.contains(team[i]) && !a.contains(team[j]) && j != i) {
                    a.add(team[i]);
                    a.add(team[j]);
                    System.out.println(" {"+ team[i] +" - "+ team[j] +"}");
                    for ( int m = 0 ; m < team.length ; m++ ) {
                        for ( int n = 0 ; n < team.length ; n++) {
                            if( !a.contains(team[n]) && !a.contains(team[m]) && m != n) {
                                a.add(team[m]);
                                a.add(team[n]);
                                System.out.println(" {"+ team[m] +" - "+ team[n] +"}");
                            }else{
                                continue;
                            }
                        }
                    }
                }else{
                    continue;
                }
            }
            System.out.println("");
            a.clear();
        }
    }
}
