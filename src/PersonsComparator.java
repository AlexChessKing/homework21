import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {

    private final int maxWordSurname;

    public PersonsComparator(Integer maxWordSurname) {
        this.maxWordSurname = maxWordSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().split("-").length >= maxWordSurname & o2.getSurname().split("-").length >= maxWordSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        if (o1.getSurname().split("-").length != o2.getSurname().split("-").length) {
            return Integer.compare(o1.getSurname().split("-").length, o2.getSurname().split("-").length);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
