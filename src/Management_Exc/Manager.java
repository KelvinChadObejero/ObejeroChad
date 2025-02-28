package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void giveRaise(Employee e, double raise) {
        if (raise < 0) {
            throw new IllegalArgumentException("Raise must be non-negative");
        }
        e.setSalary(e.getSalary() + raise);
        setSalary(getSalary() + (raise / 2));
    }

    @Override
    public String toString() {
        return "Mgr. " + super.toString();
    }
}
