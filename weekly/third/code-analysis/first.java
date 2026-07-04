class Student {
    public static int totalRegistered = 0;
    public int studentId = 1000;
    public String status = "Pending";

    public Student() {
        totalRegistered++;
        studentId = 1000 + totalRegistered;
    }

    public Student(String status) {
        this();
        this.status = status;
        totalRegistered++;
    }

    public void printInfo() {
        System.out.println("ID: " + studentId + " | Status: " + status + " | Total: " + totalRegistered);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Active");
        s1.printInfo();
        s2.printInfo();
    }
}

// Assuming the code above compiles and runs without any compilation or runtime errors, answer the following questions:
// A : What is the exact line-by-line output of this program on the console? (The output is identical in all three languages.)
// B : What is the exact value of the static field totalRegistered immediately after the object s2 is created?
// C : Analyze the constructor execution order—particularly the role of this() in Java or constructor delegation in C++—
// D : and provide a complete technical explanation of why this value is obtained.
// A: 
// ID: 1001 | Status: Pending | Total: 3
// ID: 1002 | Status: Active | Total: 3
// B:
// 3
// C:
// In the provided code, the constructor execution order is as follows:
// 1. When the first Student object (s1) is created using the default constructor
//   - The default constructor is called, which increments the static field totalRegistered by 1 (from 0 to 1).
//  - The studentId is set to 1000 + totalRegistered, resulting in studentId = 1001.
// 2. When the second Student object (s2) is created using the parameterized constructor
//   - The parameterized constructor is called, which first calls the default constructor using this()
//   - The default constructor increments totalRegistered by 1 (from 1 to 2
//  - The studentId is set to 1000 + totalRegistered, resulting in studentId = 1002.
//      -then again total Registered is incremented by 1 (from 2 to 3) in the parameterized constructor