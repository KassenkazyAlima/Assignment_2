import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Employee("Maria", "Loro", "CEO",9000000));
        person.add(new Employee("John", "Kaplan", "Secretary",190000));
        person.add(new Student("Anna", "Smith",3.95));
        person.add(new Student("Casey", "Lorme",3.45));


        Collections.sort(person);
        printData(person);


    }

    private static void printData(Iterable<Person> persons){
        for(Person person : persons){
            String message = person.toString() + " earns " + Double.toString(person.getPaymentAmount()) + " tenge";
            System.out.println(message);
        }
    }
}