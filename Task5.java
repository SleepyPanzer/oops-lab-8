import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    String address;
    int gpa;
    Student(String name,int rollNumber,String address,int gpa){
        this.name = name;
        this.rollNumber = rollNumber;
        this.address= address;
        this.gpa = gpa;
    }
    void printDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + gpa);
    }
}
class Teacher{
    String name;
    String address; 
    int telNumber;
    String degree ;
    Teacher(String name,String address,int telNumber,String degree){
        this.name = name;
        this.address = address;
        this.telNumber= telNumber;
        this.degree = degree;
    }
    void printDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telNumber);
        System.out.println("Degree Aquired: " + degree);
    }
}
class Course{
    Teacher teacher;
    String courseName;
    Student[] students;
    int top = -1;
    Course(String courseName){
        this.courseName = courseName;
        students = new Student[5];
    }
    void addTeacher(Teacher t){
        this.teacher = t;
    }
    void addStudemt(Student s){
        this.students[++top] = s;
    }
    void printCourse(){
        System.out.println("--------------------------"+courseName+"-----------------------");
        teacher.printDetails();
    }
    void printDetails(){
        printCourse();
        for(Student student: students){
            student.printDetails();
        }
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter the Course name: ");
        String courseName = input.nextLine();
        Course c = new Course(courseName);
        System.out.println("Enter Teacher's name: ");
        String name = input.nextLine();
        System.out.println("Enter Teacher's Address: ");
        String address = input.nextLine();
        System.out.println("Enter Teacher's telephone number: ");
        int telNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter Degree aquired by the Teacher: ");
        input.nextLine();
        String degree = input.nextLine();
        input.nextLine();
        Teacher t = new Teacher(name, address, telNumber, degree);
        c.addTeacher(t);
        for(int i = 0; i < 2; i++){
            System.out.println("\nEnter Student's name: ");
            name = input.nextLine();
            System.out.println("Enter Student's roll-number: "); 
            int rollNumber = input.nextInt();
            System.out.println("Enter Student's Address: "); 
            address = input.nextLine();
            System.out.println("Enter Student's GPA: "); 
            int gpa = input.nextInt();
            Student s = new Student(name, rollNumber, address, gpa);
            c.addStudemt(s);
        }
        c.printDetails();
    }       
}
