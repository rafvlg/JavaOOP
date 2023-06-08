package HomeWork3;

public class Freelancer extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Freelancer(String name, String surname, int hoursWorked, double hourlyRate) {
        super(name, surname, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, calculateSalary());
    }
}

