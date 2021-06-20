public class PrimeUtil {

    // cách 1
    public boolean isPrimeA(long number){
        for(long i = 2 ; i < number ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true ;
    }
    

    //cách 2
    public boolean isPrimeB(long number) {
        int count = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    //cách 3
    public boolean isPrimeC(long number) {
        long sqrtOfNumber = (long) Math.sqrt((double)number); //căn bậc 2 của number
        for (int i = 2; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // in ra n số nguyên tố đầu tiên trong mảng
    // cách 1
    public long[] createArrayPrimeNumbers(int n) {
        long[] result = new long[n];
        int count = 0;
        int numberToCheck = 2;
        while (count < n) {
            if (isPrimeC(numberToCheck)) {
                result[count] = numberToCheck;
                count++;
            }      
            numberToCheck++;
        }
        return result;
    }
    

    //cách 2
    public long[] createArrayPrimeNumbersB(int n) {
        long[] result = new long[n];
        int count = 0;
        int numberToCheck = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 0; i < count; i++) {
                if (numberToCheck % result[i] == 0) {
                    isPrime = false;
                break; // không phải số nguyên tố
                }
            }
            if (isPrime) {
                result[count] = numberToCheck;
                count++;
            }          
            numberToCheck++;
        }   
        return result;
    }

    //cách 3
    public long[] createArrayPrimeNumbersC(int n) {
        long[] result = new long[n];
        result[0] = 2; //Số nguyên tố đầu tiên
        int count = 0;
        int numberToCheck = 2;
        
        while (count < n) {
            boolean isPrime = true;
            long sqrtOfNumberToCheck = (long) Math.sqrt((double)numberToCheck); //căn bậc 2 của number
          
            for (int i = 0; result[i] <= sqrtOfNumberToCheck; i++) {
                if (numberToCheck % result[i] == 0) {
                    isPrime = false;
                    break; // không phải số nguyên tố
               }
            }

            if (isPrime) {
                result[count] = numberToCheck;
                count++;
            }          
            numberToCheck++;
        }    
        return result;
    }

    //kiểm tra 1 mảng xem tất cả các phần tử của mảng có phải là số ngyên tố hay không
    //hàm này dùng để kiểm tra lại làm createArrayPrimeNumbersB
    public boolean checkArrayContainsOnlyPrimeNumbers(long[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
          if (!isPrimeC(testArray[i])) {
            return false;
          }
        }
        return true;
      }
}
