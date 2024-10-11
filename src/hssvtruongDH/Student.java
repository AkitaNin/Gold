package hssvtruongDH;

public class Student {
    //Khởi tạo các thuộc tính
    private String fullName;
    private double score;
    //Tạo contructer ngay sau các khai báo thuộc tính bên trên
    //constructor mặc định sẽ khởi tạo các giá trị mặc định khi đối tượng đc tạo ra
    public Student(){
        fullName = "MiVo";
        score = 0.0;
    }
    //alt+ins tạo ra contrustor

    //Tạo contrustor có đối số
    //1 đối số
    public Student(String fullName) {
        this.fullName = fullName;//this ở đây để chỉ định chọn biến cục bộ khai báo bên trên
    }//2 đối số
    public Student(String fullNamex, double score){
        fullName = fullNamex;
        this.score = score;
    }





    //phương thức(các hàm)
    //phương thức không có kiểu trả về

    public void displayInfor(){
        System.out.println(fullName+": "+score);
    }
    public String getFullName(){
        return fullName;
    }

    public double getScore(){
        return score;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setScore(Double score){
        this.score = score;
    }

    //phương thức Có kiểu trả về
    //trả về return thì gắn biến để show ra đc
    public Double avgScore(double mathScore, double englishScore){
        return (mathScore+englishScore)/2;
    }
    public String toString(){
        return fullName + score;
    }

}
