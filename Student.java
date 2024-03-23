public class Student extends Person {
    private int age;
    private String fname;
    private String lname;
    private double medie;

    Student() {
        super();
    }

    Student(int age, String fname, String lname, double medie){
    super(age, fname, lname);

    this.medie = medie;
    }

    public double getMedie() {
        return this.medie;
    }
}