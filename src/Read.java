public class Read {
    public static class Employee{
        private final int employeeId;
        private String name;
        private double salary;

        public Employee(int employeeId, String name, double salary){
            this.employeeId = employeeId;
            this.name = name;
            this.salary = salary;
        }

        public int getEmployeeId(){
            return employeeId;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public double getSalary(){
            return salary;
        }

        public void setSalary(double salary){
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(124, "Kwesi", 2500.00);
        System.out.println("My ID: " + e1.getEmployeeId());

        e1.setName("Mr. K");
        e1.setSalary(3500.00);
        System.out.println(e1.getName() + " earns " + "$" + e1.getSalary() + " a year!");
    }
}
