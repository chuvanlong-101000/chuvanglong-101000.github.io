public class LapTrinhVien extends NhanVien {
    
    
    @Override
    public String toString() {
        return "LapTrinhVien [overtime=" + overtime + "]";
    }


    long overtime ;public LapTrinhVien(long id, String name, long tuoi, int phoneNumber, String email, long salary, long overtime) {
        super(id, name, tuoi, phoneNumber, email, salary);
        this.overtime = overtime;
    }


    public long getOvertime() {
        return overtime;
    }
    public void setOvertime(long overtime) {
        this.overtime = overtime;
    }

    public long TienLuong(){
        long tongluong = getSalary() + getOvertime() * 200000;
        return tongluong;
    } 
    
}
