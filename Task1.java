class Employee{
    String name;
    String address;
    String jobTitle;
    float salary;
    
    Employee(String name,String address,float salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    String getName(){
        return name;
    }
    float getSalary(){
        return salary;
    }
    float calculateBonus(int bonus){
        this.salary += bonus;
        return getSalary();
    }
    void generateReports(){
        System.out.println("\nName: " + getName());
        System.out.println("Address: " + address);
        System.out.println("Salary: " + getSalary());
    }
    void salaryInfo(){
        System.out.println("\nName: " + getName());
        System.out.println("After bonus applied: " + getSalary());
    }
}
class Manager extends Employee{
    static String jobTitle = "Manager";
    Manager(String name,String address,float salary){
        super(name, address, salary);
    }
}
class Developer extends Employee{
    static String jobTitle = "Developer";
    Developer(String name,String address,float salary){
        super(name, address, salary);
    }
}
class Programmer extends Employee{
    static String jobTitle = "Programmer";
    Programmer(String name,String address,float salary){
        super(name, address, salary);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Employee murtaza = new Manager("Murtaza", "Saddar",  150000); 
        Employee abdullah = new Programmer("Abdullah", "PIA Society",  70000);
        Employee anas = new Developer("Anas", "Safoora",  60000); 

        murtaza.generateReports();
        abdullah.generateReports();
        anas.generateReports();

        murtaza.calculateBonus(50000);
        abdullah.calculateBonus(30000);
        anas.calculateBonus(20000);

        murtaza.salaryInfo();
        abdullah.salaryInfo();
        anas.salaryInfo();
    }
}