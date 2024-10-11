public class Step16_for {
    public static void main(String[] args) {
     /*   for (int i = 0; i<=5; i++){ // khởi tạo biến i có giá trị bân đầu là 0, điều kiện i <=5, mỗi lần lặp là tăng i lên 1
            System.out.println("giá trị i là: " +i);//khi điều kiện true thi in ra giá trị i
        }//khi điều kiện false sẽ dừng ko in nữa*/

        int kq = 1; //Khởi tạo 1 biến kq có giá trị = 1
        for (int n = 0; n <=10; n+=2){ // Cho vòng lặp từ 0 đến <= 10, mỗi lần +2 giá trị
            kq+=n;// kq = kq  + n ( tức là 1 + 2( vòng lặp 2 4 6 8 10 )
        }
        System.out.println("Giá trị tổng là: " +kq);
    }
}
