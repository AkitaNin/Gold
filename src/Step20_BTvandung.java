import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Step20_BTvandung {
    public static void main(String[] args) {
        //Viết ctrinh nhập ngày tháng năm và in ra số tuổi


        int day,month,year;
        Calendar cal = Calendar.getInstance();//Lấy tất cả thông tin ngày tháng năm hiện tại
        System.out.println(cal);//IN ra
        //Gắn các  biến vào giá trị ngày tháng năm mong muốn
        day = cal.get(Calendar.DATE);
        month = cal.get(Calendar.MONTH);
        year = cal.get(Calendar.YEAR);
        //Chỉ in ~ gia trị date time mong muốn
        System.out.println(day+"/"+
                (month+1)+"/"+ //lấy them index nên cần fai +1 vì tháng sẽ chạy từ index 0 - 11
                year);
     /*   System.out.println(day);
        System.out.println(month+1);
        System.out.println(year);
*/
        //Thiết lập hoặc gán cho giá trị datetime mình mong muốn
        cal.set(Calendar.YEAR,1992);//Gắn cho giá trị datetime là năm 1992 hệ thống sẽ hiểu year trong datetime sẽ là 1992
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DATE,9);

        //Khai báo lại các biến lưu trữ datetime vừa gắn giá trị
        int dayOB,monthOB,yearOB;
        //Gắn giá trị cho các biến trên
        dayOB = cal.get(Calendar.DATE);
        monthOB = cal.get(Calendar.MONTH);
        yearOB = cal.get(Calendar.YEAR);
        //in nó ra
        System.out.println(dayOB+"/"+
                (monthOB+1)+"/"+ //lấy them index nên cần fai +1 vì tháng sẽ chạy từ index 0 - 11
                yearOB);
        //Xuất theo định dạng
        //Khởi tạo cho datetime 1 định dạng
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyy hh:mm");
        //Tạo xong fai tạo 1 biến để lưu trữ date time về
        Date dz = cal.getTime();
        String ngaythangnam = dtFormat.format(dz);
        System.out.println(ngaythangnam);


        //BT
        int d,m,y,age;
        Scanner input = new Scanner(System.in);

        System.out.println("Mời nhập ngày sinh: ");
        d = input.nextInt();
        System.out.println("Mời nhập ngày tháng: ");
        m = input.nextInt();
        System.out.println("Mời nhập ngày năm: ");
        y = input.nextInt();

        Calendar BD = Calendar.getInstance();
        BD.set(d,m-1,y);
        int dB,mB,yB;
        dB = BD.get(Calendar.DATE);
        mB = BD.get(Calendar.MONTH);
        yB = BD.get(Calendar.YEAR);
        System.out.println(dB+"/"+
                (mB+1)+"/"+ //lấy them index nên cần fai +1 vì tháng sẽ chạy từ index 0 - 11
                yB);
    }
}

