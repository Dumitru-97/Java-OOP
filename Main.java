// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        Person A = new Person("Ramon", 24);
        Person B = new Person();
        System.out.println("This person " + A.getFname() + " has " + A.getAge() + " years old ");

        A.setFname("Adi");
        A.setAge(23);
        A.setLname("Nastase");

        System.out.println(A);


        Student S = new Student();

        System.out.println(S);


        Student S1 = new Student(38, "Mihai", "Petrescu", 8.33);

        System.out.println(S1);
        System.out.println(S1.getMedie());

    }
}