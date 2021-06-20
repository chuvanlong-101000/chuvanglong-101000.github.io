public class IdGenerator {
    private static long id = 0L;
    public static long getNewID() {
        id += 1; //tăng thêm 1 đơn vi khi đc gọi đến
        return id ;
    }
}
