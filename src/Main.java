import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> comparator1 = (o1, o2) -> {
            int maxWordSurname = 3;

            if (o1.getSurname().split("-").length >= maxWordSurname & o2.getSurname().split("-").length >= maxWordSurname) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            if (o1.getSurname().split("-").length != o2.getSurname().split("-").length) {
                return Integer.compare(o1.getSurname().split("-").length, o2.getSurname().split("-").length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(people, comparator1);

        System.out.println(people);

        Comparator<Person> comparator2 = (o1, o2) -> {
            int maxWordSurname = 2;

            if (o1.getSurname().split("-").length >= maxWordSurname & o2.getSurname().split("-").length >= maxWordSurname) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            if (o1.getSurname().split("-").length != o2.getSurname().split("-").length) {
                return Integer.compare(o1.getSurname().split("-").length, o2.getSurname().split("-").length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(people, comparator2);

        System.out.println(people);
    }
}
