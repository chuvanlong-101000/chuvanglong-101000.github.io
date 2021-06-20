public class Math {
    public boolean isOdd(int x) {
        return x % 2 == 0;
    }
    

    //tính chỉ số BMI
    public float calculateBMI(float height, float weight) {
        return weight/(height*height);
    }
    
    //tính chu vi hình tròn
    public float circle_perimeter(float diameter) {
        return diameter * 3.14f;  
    }
    
    // xác định x,y,z có tạo thành tam giác không
    public boolean isTriangle(float x, float y, float z) {
        return ((x + y) > z)&&((x + z)> y) &&((y + z) >x);
    }
    
    //Tìm số nhỏ nhất trong 3 số x,y,z
    public float smallestIn3Numbers(float x, float y, float z) {
        if(x < y){
            if(x < z){
            return x;
            }
            else {
            return z;
            }
        } 
        else { 
            if(y < z){
            return y;
            }
             else {
            return z;
            }
        }
    
    
    }

    //tính tổng mảng
    public float sum(int[] numbers) {
        float s = 0f;
        for (int i = 0; i < numbers.length; i++) {
            s += numbers[i];
        }
        return s;
    }
    
    //tính trung bình cộng
    public float average(int[] numbers) {
        float sum = 0f;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
    
    public int[] reverseArray(int[] numbers) {
        return null;
    }

    //đếm các số lẻ trong mảng  
    public int countOddNumber(int[] numbers) {
        int dem = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ( dem % 2 != 0) {
                dem++;
            }
        }
        return dem;
    }


    // in ra các số lẻ trong mảng
    public int[] oddNumberArray(int[] numbers) {
        int dem= 0;
        for (int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] % 2 !=0){
                dem=dem+1;
            }
        }
        int[] n=new int[dem];
        int t=0;
        for(int i=0 ; i < numbers.length ; i++){
            if(numbers[i] %2 != 0){
                n[t++]=numbers[i];
            }
        }
        return n;
    }

    //tính BMI và đưa ra lời khuyên
    public String bmiRating(float height, float weight) {
        float BMI = weight/(height*height);
            if( BMI < 18.5 ){
                System.out.println("Nhẹ cân");
            }
            if(( BMI >= 18.5 ) && ( BMI <= 24.9 )){
                System.out.println("Bình thường");
            }
            if(( BMI >= 25.0 ) && ( BMI <= 29.9 )){
                System.out.println("Quá cân");
            }
            if( BMI >= 30.0 ){
                System.out.println("Nguy hiểm");
            }
            return "";
    }


    public static long sqrt(double number) {
        return 0;
    }

}
