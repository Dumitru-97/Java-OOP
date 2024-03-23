public class Person {
    private String fname;
    private String lname;
    private int age;
    private String adrress;

    Person() {
        fname = "Unknow";
        lname = null;
        age = 20;
    }

    Person(String fname, int age) {
        this.lname = fname;
        this.age = age;
    }

    Person(int age, String adrress, String fname) {
        this.age = age;
        this.adrress = adrress;
        this.fname = fname;
    }

    public int getAge() {

        return this.age;
    }

    public String getFname() {

        return this.fname;
    }

    public String getLname() {

        return this.lname;
    }

    public String getAdrress() {

        return this.adrress;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setFname(String adi) {

        this.lname = lname;
    }

    public void setLname(String lname) {

        this.lname = lname;
    }

    public void setAdrress(String adrress) {

        this.adrress = adrress;
    }

    public String toString() {
        return "This person's name is: " + this.fname + " " + this.lname + " " +
                " and he is " + this.age + " years old ";
    }
}

