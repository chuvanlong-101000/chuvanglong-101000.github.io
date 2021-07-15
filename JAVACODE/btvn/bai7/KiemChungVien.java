public class KiemChungVien extends NhanVien {
    public KiemChungVien(long id, String name, long tuoi, int phoneNumber, String email, long salary, int soloi) {
        super(id, name, tuoi, phoneNumber, email, salary);
        this.soloi = soloi;
    }

    public int getSoloi() {
        return soloi;
    }

    public void setSoloi(int soloi) {
        this.soloi = soloi;
    }

    @Override
    public String toString() {
        return "KiemChungVien [soloi=" + soloi + "]";
    }

    int soloi ;

    public long TienLuong() {
        long tongluong = getSalary() + getSoloi() * 50000;
        return tongluong ;
    }
}
