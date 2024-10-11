import hssvtruongDH.Student;

public class Step30_OOPbuoi1 {
    public static void main(String[] args) {
        //Khởi tạo đối tượng thuộc class hssvtruongDH.Student
        Student st1 = new Student();
        Student st2 = new Student();
        st1.displayInfor();
        st2.displayInfor();

        //Khởi tạo đối tương só sử dụng contrustor xài biến
        Student st3 = new Student("My");
        st3.displayInfor();
        Student st4 = new Student("Vy",9.0);
        st4.displayInfor();

        System.out.println(st4.getFullName());
        System.out.println(st4.getScore());
        //đổi tên cho st4
        st4.setFullName("Vi");
        st4.setScore(5.0);
        st4.displayInfor();
        //sử dụng hàm có phương thức trả về kết quả
        //Khởi tạo biến để lưu trữ thì mới show ra đc
        //Điểm thì nên double or float nếu int or str không đc
        double avgScorest4  = st4.avgScore(5,4);
        st4.displayInfor();
        System.out.println(avgScorest4);
        System.out.println(st4);//sau khi khai báo tostring mới xuất ra đc


    }
}
