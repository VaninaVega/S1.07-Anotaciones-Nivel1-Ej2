public class worker {
    protected String name;
    protected String surname;
    protected double priceByHour;

    public worker(String name, String surname, double price) {
        this.name = name;
        this.surname = surname;
        this.priceByHour = price;
    }

    public double calculateSalary(int hoursWorked) {
        double salary = (double)hoursWorked * this.priceByHour;
        return salary;
    }
}