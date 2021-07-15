import java.util.ArrayList;

public class App extends Thread {
    public static void main (String[] args) {
        LapTrinhVien ltv1 = new LapTrinhVien( 1,"Chử Văn Long", 21 , 0334551213 , "vanlong@gmail.com" , 15000000 , 4);
        LapTrinhVien ltv2 = new LapTrinhVien( 2,"Nguyễn Văn A", 26 , 0334552131 , "vanA@gmail.com" , 25000000 , 8);

        KiemChungVien kcv1 = new KiemChungVien( 1,"Chử Văn Long", 21 , 0334551213 , "vanlong@gmail.com" , 15000000 , 20 );
        KiemChungVien kcv2 = new KiemChungVien( 2,"Nguyễn Văn A", 26 , 0334552131 , "vanA@gmail.com" , 25000000 , 15 );
        
        //Lập trình viên
        ArrayList<LapTrinhVien> a = new ArrayList<>();
        a.add(ltv1);
        a.add(ltv2);
        for( LapTrinhVien laptrinhvien : a) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println(e);
            }
            System.out.println(laptrinhvien);
        }

        for( LapTrinhVien laptrinhvien : a) {
            laptrinhvien.TienLuong();
            System.out.println(laptrinhvien.TienLuong());
        }


        // kiểm chứng viên
        ArrayList<KiemChungVien> b = new ArrayList<>();
        b.add(kcv1);
        b.add(kcv2);
        for( KiemChungVien kiemchungvien : b) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println(e);
            }
            System.out.println(kiemchungvien);
        }

        for( KiemChungVien kiemchungvien : b) {
            kiemchungvien.TienLuong();
            System.out.println(kiemchungvien.TienLuong());
        }
        
    }
}
