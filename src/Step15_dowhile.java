public class Step15_dowhile {
    public static void main(String[] args) {
        int a = 1; //khởi tạo biến a có giá trị là 1
        int kq = 0; // khởi tạo biến kq có giá trị là 0

        //sử dụng do while làm 1 hành động + dồn a
        do{
            kq += a; // làm hành động kq = kq + a
            a++; // tăng giá trị a lên 1
        } while (a<=4); // khi nào giá trị a <= 4
        System.out.println("Giá trị kq là: " +kq); //in ra giá trị kq đã + dồn nãy h
    }
}
