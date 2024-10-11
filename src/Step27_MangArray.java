public class Step27_MangArray {
    public static void main(String[] args) {
        //khai báo mảng
       /* String [] arStr;
        Float [] arFl;
        Double [] arDb;*/

        //Khai báo kèm theo kích thước
        String [] arrStr1 = new String[12];// chứa tối đa 12 phần tử
        int [] arrInt1 = new int[10];

        //Khởi tạo mạng kèm giá trị ban đầu
        String [] arrStr2 = new String[]{"Linh Xe ôm","Tài Chó điên","Nin đẹp trai"};
        int [] arrInt2 = new int[]{1,2,3,4,5,6};

        //System.out.println(arrStr1[1]);
        System.out.println(arrStr2[1]);
        int a = arrInt2.length;
        System.out.println(a);
        for (int countArrint2 : arrInt2){
            System.out.print(countArrint2+" ");

        }
        System.out.println("");
        //sử dụng suất mảng ra như bthg fai gắn kiểu dữ liệu cho mảng
        for (String countArrstr2 : arrStr2){
            System.out.print(countArrstr2+", ");
        }
        System.out.println("");
        //sử dụng vòng lặp for để gắn i vào từng phần tử trong mảng r xuất ra
        //Không cần gắn kiểu dữ liệu
        for (int runi = 0; runi < arrInt2.length; runi++){
            System.out.print(arrInt2[runi]+" ");
        }
        arrInt2[0]= 3;
        System.out.print("change to: ");
        for (int runi = 0; runi < arrInt2.length; runi++) {
            System.out.print(arrInt2[runi] + " ");
        }
        //update toàn bộ 1 mang
        System.out.println("");
        int [] arrInt3 = new int[]{1,2,3,4,5};
        for (int plusi = 0 ; plusi < arrInt3.length; plusi++){
            arrInt3[plusi]+=5;
            System.out.print(arrInt3[plusi]+" ");
        }


    }
}
