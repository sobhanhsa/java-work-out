class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;

        if (salary <= 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }

    public void getInfo() {
        System.out.println("Name: " + name + " | Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}