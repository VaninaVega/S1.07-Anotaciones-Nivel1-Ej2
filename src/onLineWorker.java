public class onLineWorker extends worker {
    private static final double internet = 15; // Tarifa fija

    public onLineWorker(String name, String surname, double price) {
        super(name, surname, price);
    }


    @Deprecated //Método obsoleto
    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) * internet;
    }
}
