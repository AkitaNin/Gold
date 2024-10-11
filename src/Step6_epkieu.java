public class Step6_epkieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; //ép dữ liệu int >> double
        System.out.println("Kết quả: "+kq);

        //ép kiểu hẹp
        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

    }
}
