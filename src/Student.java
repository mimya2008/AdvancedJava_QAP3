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
    public String getMyIdNum() {return myIdNum;}

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {return myGPA;}

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    // To String
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

}
