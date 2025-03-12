public class Person {
    protected String myName; // name of the person
    protected int myAge;   // person’s age
    protected String myGender;   // “M” for male, “F” for female


    // constructors
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // getters setters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public int getAge() {
        return myAge;
    }


    public void setAge(int age) {
        this.myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    // to String
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
