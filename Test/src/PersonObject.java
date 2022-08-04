import java.time.LocalDate;

public class PersonObject {

    public static void main(String[] args) {
        Person person = new Person("Mustafa", 7, LocalDate.of(2015, 11, 20));

        person.setSsn(7654);

        System.out.println(person);
    }
}
