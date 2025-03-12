public class Student extends Person {
    protected String myIdNum;    // Student id Number
    protected double myGPA;      // grade point average

    // constructors
    public Student(String name, int age, String gender, String idNum, double gpa)  {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    // getters and setters
    public String getIdNum() {return myIdNum;}

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {return myGPA;}

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // To String
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

}
