public class Salary extends Sendable{
    private  Integer salary;

    public Salary(String from, String to, Integer salary) {
        super(from, to);
        this.salary = salary;
    }
}