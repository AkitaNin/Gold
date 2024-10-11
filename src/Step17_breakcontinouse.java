public class Step17_breakcontinouse {
    public static void main(String[] args) {
        //tính tổng từ 1 đến 5 nhưng bỏ qua số 3
        int kq = 0;
        for (int i = 0 ; i<=5; i++){
            if(i==3)//Nếu i = 3 thì dùng continouse để bỏ qua giá trị này
                continue;//dùng để bỏ qua 1 hay nhiều giá trị nào đó
            else
                kq += i;
        }
        System.out.println("KQ: "+kq);


        //break
        int ab = 0;
        while (ab <= 100){
            System.out.println("AB = " +ab);
            if (ab == 20)
                break;
            ab+=2;
        }
    }
}
