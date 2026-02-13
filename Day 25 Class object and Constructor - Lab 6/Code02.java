public class Code02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sandesh","KTM",100);
        s1.displayInfo();
        s2.displayInfo();
    }
}
class Student{
    String name;
    String address;
    int roll;
    // default constructor
    public Student(){
        this.name = "null";
        this.address = "null";
        this.roll = 0;
    }
    // parameterized constructor
    public Student(String name, String address, int roll) {
        this.name = name;
        this.address = address;
        this.roll = roll;
    }
    public void displayInfo(){
        System.out.println("Name :"+this.name+" Address :"+this.address+" Roll no : "+this.roll);
    }
}
/*
        System.out.println("Displaying both details :");
        System.out.println("Student 1 : Name :"+s1.name+" Address :"+s1.address+" Roll no : "+s1.roll);
        System.out.println("Student 2 : Name :"+s2.name+" Address :"+s2.address+" Roll no : "+s2.roll);
* */