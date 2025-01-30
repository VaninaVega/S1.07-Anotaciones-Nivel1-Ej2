public class onSiteWorker extends worker {
    private static double gasoline = 26.0;

    public onSiteWorker(String name, String surname, double price) {
        super(name, surname, price);
    }

    @Deprecated //Método obsoleto
    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) * gasoline;
    }
}
