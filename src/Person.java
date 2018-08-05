public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        if(firstName == null || lastName == null || firstName.length() < 2 || lastName.length() < 2)
            try {
                throw new NameUndefinedException("Imie i nazwisko nie może być nullem i mieć mniej niż 2 znaki");
            } catch (NameUndefinedException e) {
                e.printStackTrace();
            }
        if( age < 1)
            try {
                throw new IncorrectAgeException("Wiek nie moze byc mniejszy niz 1");
            } catch (IncorrectAgeException e) {
                e.printStackTrace();
            }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    @Override
    public String toString() {
        return "Imię:" + " " + firstName + " " + "Nazwisko:" + " " + lastName + " " + "Wiek:" + " " + age + " " + "Pesel:" + " " + pesel;
    }
}