class Student{
    public int roll_no;
    public String name;
    public char sec;
    public Student(){
        System.out.println("This is constructor for Student class");
    }
}
class Faculty{
    public int faculty_id;
    public String Faculty_name;
    public Faculty(){
        System.out.println("this is the constructor for Faculty class");
    }

}
public class College {
    public static void main(String[] args) {
        Student stud=new Student();
        Faculty fac=new Faculty();

    }
}
