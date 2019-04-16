public class ContractedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    private String federalTaxId;
    private double hourlyRate;
    private double numberOfHoursWorked;
    private double averageMonthlySalary;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
    }

    @Override
    public String toString() {
        return "ContractedEmployee{" +
                "federalTaxId='" + federalTaxId + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", averageMonthlySalary=" + String.format("%.2f", averageMonthlySalary) +
                ", name=" + getName() +
                '}';
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;
    }

}
