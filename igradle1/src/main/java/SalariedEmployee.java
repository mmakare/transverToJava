public class SalariedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    private double fixedMonthlyPayment;
    private double averageMonthlySalary;
    private String socialSecurityNumber;
    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", averageMonthlySalary=" + String.format("%.2f", averageMonthlySalary) +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", name=" + getName() +
                '}';
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void calculatePay() {
        averageMonthlySalary = fixedMonthlyPayment;
    }


}
