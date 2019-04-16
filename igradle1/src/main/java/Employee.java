public class Employee implements calculatePay {
    private static double count;
    // TODO fix class declaration and declare variables here
    private String employeeId;
    private String name;


    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        count++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return 0;
    }

    @Override
    public String toString() {
        return (employeeId + " " + name);
    }

    public void calculatePay() {
    }
}
