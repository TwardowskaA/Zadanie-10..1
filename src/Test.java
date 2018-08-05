import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String firstName = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scan.nextLine();
        System.out.println("Podaj wiek:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj PESEL:");
        String pesel = scan.nextLine();


        Person person = null;
        try {
            person = new Person(firstName, lastName, age, pesel);
        } catch (NameUndefinedException e) {
            e.printStackTrace();
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        }
        System.out.println(person.toString());

    }
}