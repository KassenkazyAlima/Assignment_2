import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Person implements payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id = id_gen;
    private String name;
    private String surname;

    public Person(){
        this.id = id_gen++;
    }
    public Person(String name, String surname){
        this.id = id_gen++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public String toString(){
        return Integer.toString(getId()) + ". " + getName()  + " " + getSurname();
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount(){
        return 0;
    }
    @Override
    public int compareTo(Person o){
        return Double.compare(
                this.getPaymentAmount(),
                o.getPaymentAmount()
        );
    }
}
