package btvn;

public class Sosanh {
    public static void main(String[] args) {
        int []a={6,7,8,5,4,1,2,3};
        long end,start,resutl;
        // Thời gian chạy Quicksort
        start=System.nanoTime();
        Quicksort(a, 0, a.length-1);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Quick sort: " + resutl);
        // Thời gian chạy MergeSort
        start=System.nanoTime();
        MergeSort(a, 0, a.length-1);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Merge sort: " + resutl);
        // Thời gian chạy sx chèn
        start=System.nanoTime();
        Insert(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp chèn: " + resutl);
        // Thời gian chạy sx chọn
        start=System.nanoTime();
        Select(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp chọn: " + resutl);
        // Thời gian chạy sx nổi bọt
        start=System.nanoTime();
        Bubble(a);
        end=System.nanoTime();
        resutl=end-start;
        System.out.println("Sắp xếp nổi bọt: " + resutl);        
    }


    //Sắp xếp nổi bột 
    public static void Bubble(int []a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = 0; j < n-1; j++) {
                if (a[j] > a[j+1]) {
                     check = false;
                    int tg = a[j];
                     a[j] = a[j+1];
                     a[j+1] = tg;
                }
            }                        
            if (check == true) {
                break;
            }
        }
 
    }


    //Sắp xếp chọn
    public static void Select(int []a){
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i] > a[j]) {
                    int tg = a[j];
                    a[j] = a[i];
                    a[i] = tg;
                }
            }
          
        }
    }

    
    //Sắp xếp chèn 
    public static void Insert(int []a){
        for (int i = 0; i < a.length; i++) {
            int ai = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;                     
        }
    }


    public static void Quicksort(int []a,int left,int right){
        if (left >= right) {
            return;
        }
        int key = a[(left + right)/2];
        int k= Partition(a, left, right, key);
        Quicksort(a, left, k-1);
        Quicksort(a, k, right);
    }


    public static int Partition(int []a,int left,int right,int key){
        while (left <= right) {
            while (a[left] < key) {left++;}
            
            while (a[right] > key){ right--;}
            
            if (left <= right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }


    public static int[] MergeSort(int[] a, int left, int right) {
        if (left > right)
            return new int[0];
        if (left == right) {
            int[] single = { a[left] };
            return single;
        }
        
        int mid = (left + right) / 2;
        int[] a1 = MergeSort(a, left, mid);
        int[] a2 = MergeSort(a, mid + 1, right);

        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i1++;
                    i++;
                } else {
                    result[i] = a2[i2];
                    i2++;
                    i++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i1++;
                    i++;
                } else {
                    result[i] = a2[i2];
                    i2++;
                    i++;
                }
            }
        }        
        return result;
    }
}
