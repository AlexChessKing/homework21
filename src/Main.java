import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Хосе Рауль", "Капабланка-и-Граупера", 22));
        people.add(new Person("Евгений", "Зноско-Боровский", 26));
        people.add(new Person("Александр", "Алехин", 18));
        people.add(new Person("Федор", "Дуз-Хотимирский", 31));
        people.add(new Person("Александр", "Ильин-Женевский", 16));

        System.out.println(people);

        Collections.sort(people, new PersonsComparator(3));

        System.out.println(people);

        Collections.sort(people, new PersonsComparator(2));

        System.out.println(people);
    }
}
