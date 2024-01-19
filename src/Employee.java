public class Employee extends Person{
    private String position;
    private double salary;

    public String toString(){
        return "Employee " + super.toString();
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String Position, double salary) {
        super.setName(name);
        super.setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    @Override
    public double getPaymentAmount(){
        return salary;
    }
}



