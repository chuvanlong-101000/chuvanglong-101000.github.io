package Recursion;

public class Demo_Recursion {
    public static void methodA(){
        System.out.println("A");
        methodA();
    }

    //Tính giai thừa bằng vòng lặp for
    public static int factorialWhithFor(int n){
        int factorial = 1;
        if(n == 0){
            return factorial;
        }else{
            for(int i = 1; i <= n; i++){
                factorial *= i;
            }
            return factorial;
        }

    }

    //Tính giai thừa sử dụng đệ quy
    public static int factorial(int n){
        if(n == 0){  // 0! = 1
            return 1;
        }

        //Công thức đệ quy
        return n*factorial(n-1);
    }

    //Tính luỹ tiến
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int tailSum(int currentSum, int n){
        if(n <= 1){
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }
    //Tính dãy Fibonace bằng đệ quy
    public static int Fibo(int n) {
        //1 .bài toán cơ sở 
        if( n <= 2)
        return 1;
        // 2.công thứu đệ quy
        int Fn = Fibo(n-1) + Fibo(n-2) ;
        return Fn ; 
    }
    //Tính dãy Fibonacy bắng vòng for
    public static int Fibonacy(int n) {
        int f0 = 0 ;
        int f1 = 1 ;
        int fn = 1 ;
        if( n == 0 || n == 1 ) {
            return n ;
        }else{
            for(int i =2 ; i < n ; i++){
                f0 = f1 ;
                f1 = fn ;
                fn = f0 + f1 ; 
            }            
        }
        return fn;
    }

    public static void main(String[] args) {
        //methodA();
        //System.out.println("5! = " + factorial(5));
        //System.out.println(sum(5));
        //System.out.println(Fibo(8));
    }
}
